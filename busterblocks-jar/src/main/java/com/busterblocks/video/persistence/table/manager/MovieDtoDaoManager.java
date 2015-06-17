package com.busterblocks.video.persistence.table.manager;

import com.busterblocks.rental.gateway.VideoRentalComponent;
import com.busterblocks.rental.structure.VideoRental;
import com.busterblocks.video.persistence.table.dao.VideoViewDtoDAO;
import com.busterblocks.video.persistence.table.dto.VideoViewDto;
import com.busterblocks.video.persistence.table.dto.VideoViewDtoExample;
import com.busterblocks.video.structure.Actor;
import com.busterblocks.video.structure.Genre;
import com.busterblocks.video.structure.Movie;
import com.busterblocks.video.structure.VideoStatus;
import com.busterblocks.video.structure.builder.MovieBuilder;
import com.busterblocks.video.structure.builder.VideoBuilder;
import com.busterblocks.video.structure.builder.VideoItemBuilder;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieDtoDaoManager {

	private VideoViewDtoDAO videoViewDtoDAO;
	private VideoRentalComponent videoRentalComponent;

	public Collection<Movie> findMatchingMovies(final String movieName, final String genre, final Collection<String> actorNames, final String status) {
		final VideoViewDtoExample videoViewDtoExample = new VideoViewDtoExample();
		final VideoViewDtoExample.Criteria criteria = videoViewDtoExample.createCriteria();
		if (movieName != null) {
			criteria.andMOVIE_NAMEEqualTo(movieName);
		}
		if (genre != null) {
			criteria.andGENRE_DESCRIPTIONEqualTo(genre);
		}
		if ((actorNames != null) && !actorNames.isEmpty()) {
			criteria.andACTOR_NAMEIn(new ArrayList<String>(actorNames));
		}
		if (status != null) {
			final DateTime today = new DateTime();
			if (status.equals("Released")) {
				criteria.andDATE_VIDEO_RELEASEDLessThanOrEqualTo(today.toDate());
			} else if (status.equals("Forthcoming")) {
				criteria.andDATE_VIDEO_RELEASEDGreaterThan(today.toDate());
			}
		}
		final Collection<VideoViewDto> result = getVideoViewDtoDAO().selectByExample(videoViewDtoExample);
		final Collection<Movie> movies = transform(result);
		return movies;
	}

	private Collection<Movie> transform(final Collection<VideoViewDto> videoViewDtos) {
		final Collection<Movie> movies = new ArrayList<>();
		if (videoViewDtos != null) {
			final Map<String, Genre> genres = new HashMap<>();
			final Map<String, Actor> actors = new HashMap<>();
			final Map<String, VideoStatus> videoStatuses = new HashMap<>();
			final Map<String, MovieBuilder> movieBuilders = new HashMap<>();
			final Map<String, VideoBuilder> videoBuilders = new HashMap<>();
			final Map<String, VideoItemBuilder> videoItemBuilders = new HashMap<>();

			for (final VideoViewDto videoViewDto : videoViewDtos) {
				Genre genre = null;
				if (videoViewDto.getGENRE_ID() != null) {
					final String genreId = videoViewDto.getGENRE_ID().toString();
					if (!genres.containsKey(genreId)) {
						genres.put(genreId, new Genre(genreId, videoViewDto.getGENRE_DESCRIPTION()));
					}
					genre = genres.get(genreId);
				}

				Actor actor = null;
				if (videoViewDto.getACTOR_ID() != null) {
					final String actorId = videoViewDto.getACTOR_ID().toString();
					if (!actors.containsKey(actorId)) {
						actors.put(actorId, new Actor(actorId, videoViewDto.getACTOR_NAME()));
					}
					actor = actors.get(actorId);
				}

				VideoStatus videoStatus = null;
				if (videoViewDto.getVIDEO_STATUS_ID() != null) {
					final String videoStatusId = videoViewDto.getVIDEO_STATUS_ID().toString();
					if (!videoStatuses.containsKey(videoStatusId)) {
						videoStatuses.put(videoStatusId, new VideoStatus(videoStatusId, videoViewDto.getVIDEO_STATUS_DESCRIPTION()));
					}
					videoStatus = videoStatuses.get(videoStatusId);
				}

				MovieBuilder movieBuilder = null;
				if (videoViewDto.getMOVIE_ID() != null) {
					final String movieId = videoViewDto.getMOVIE_ID().toString();
					if (!movieBuilders.containsKey(movieId)) {
						movieBuilders.put(movieId, new MovieBuilder(
								movieId,
								videoViewDto.getMOVIE_NAME(),
								genre,
								(videoViewDto.getDURATION_IN_MINUTES() != null)? new Integer(videoViewDto.getDURATION_IN_MINUTES()) : null));
					}
					movieBuilder = movieBuilders.get(movieId);
				}

				VideoBuilder videoBuilder = null;
				if (videoViewDto.getVIDEO_ID() != null) {
					final String videoId = videoViewDto.getVIDEO_ID().toString();
					if (!videoBuilders.containsKey(videoId)) {
						videoBuilders.put(videoId, new VideoBuilder(
								videoId,
								new DateTime(videoViewDto.getDATE_VIDEO_RELEASED()),
								null));
					}
					videoBuilder = videoBuilders.get(videoId);
				}

				VideoItemBuilder videoItemBuilder = null;
				if (videoViewDto.getVIDEO_ITEM_ID() != null) {
					final String videoItemId = videoViewDto.getVIDEO_ITEM_ID().toString();
					if (!videoItemBuilders.containsKey(videoItemId)) {
						videoItemBuilders.put(videoItemId, new VideoItemBuilder(
								videoItemId,
								videoViewDto.getSERIAL_NUMBER(),
								new DateTime(videoViewDto.getDATE_VIDEO_ITEM_CREATED()),
								videoStatus));
					}
					videoItemBuilder = videoItemBuilders.get(videoItemId);
				}

				if (actor != null) {
					movieBuilder.add(actor);
				}

				movieBuilder.setVideoBuilder(videoBuilder);
				videoBuilder.add(videoItemBuilder);
			}

			if (!videoBuilders.isEmpty()) {
				determineVideoStatuses(videoBuilders);
			}
			for (final MovieBuilder movieBuilder : movieBuilders.values()) {
				movies.add(movieBuilder.build());
			}
		}
		return movies;
	}

	private void determineVideoStatuses(final Map<String, VideoBuilder> videoBuilders) {
		final List<String> videoItemIds = new ArrayList<>();
		for (final VideoBuilder videoBuilder : videoBuilders.values()) {
			if (videoBuilder.getItemBuilders() != null) {
				for (final VideoItemBuilder videoItemBuilder : videoBuilder.getItemBuilders()) {
					videoItemIds.add(videoItemBuilder.getId());
				}
			}
		}

		final Map<String, VideoRental> lastRentals;
		if (!videoItemIds.isEmpty()) {
			lastRentals = getVideoRentalComponent().retrieveLastRentals(videoItemIds);
		} else {
			lastRentals = new HashMap<>();
		}

		final DateTime today = new DateTime();
		for (final VideoBuilder videoBuilder : videoBuilders.values()) {
			final VideoStatus videoStatus = determineVideoStatus(videoBuilder, lastRentals, today);
			videoBuilder.setStatus(videoStatus);
		}
	}

	private VideoStatus determineVideoStatus(final VideoBuilder videoBuilder, final Map<String, VideoRental> lastRentals, final DateTime today) {
		String videoStatusDescription = VideoStatus.UNKNOWN;

		if (videoBuilder.getDateReleased().isAfter(today)) {
			videoStatusDescription = VideoStatus.COMING_SOON;

		} else if (videoBuilder.getItemBuilders() != null) {
			for (final VideoItemBuilder videoItemBuilder : videoBuilder.getItemBuilders()) {
				if (videoItemBuilder.getStatus().isInService()) {
					final VideoRental lastRental = lastRentals.get(videoItemBuilder.getId());
					if ((lastRental == null) || (lastRental.getDateReturned() != null)) {
						videoStatusDescription = VideoStatus.AVAILABLE;
					} else if (!VideoStatus.AVAILABLE.equals(videoStatusDescription)) {
						videoStatusDescription = VideoStatus.BORROWED;
					}
				}
				if (videoItemBuilder.getStatus().isRetired() &&
						!VideoStatus.AVAILABLE.equals(videoStatusDescription) &&
						!VideoStatus.BORROWED.equals(videoStatusDescription)) {
					videoStatusDescription = VideoStatus.RETIRED;
				}
			}
		}

		return new VideoStatus(null, videoStatusDescription);
	}

	private VideoViewDtoDAO getVideoViewDtoDAO() {
		return videoViewDtoDAO;
	}

	public void setVideoViewDtoDAO(VideoViewDtoDAO videoViewDtoDAO) {
		this.videoViewDtoDAO = videoViewDtoDAO;
	}

	private VideoRentalComponent getVideoRentalComponent() {
		return videoRentalComponent;
	}

	public void setVideoRentalComponent(VideoRentalComponent videoRentalComponent) {
		this.videoRentalComponent = videoRentalComponent;
	}

}
