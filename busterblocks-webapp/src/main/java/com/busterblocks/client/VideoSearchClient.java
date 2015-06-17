package com.busterblocks.client;

import busterblocks.integration.jaxb.SearchVideosRequest;
import busterblocks.integration.jaxb.SearchVideosResponse;
import busterblocks.integration.jaxb.ServiceVideo;
import com.busterblocks.dto.MovieVideoDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class VideoSearchClient extends BaseClient {

	public Collection<MovieVideoDto> searchVideos(final String movieName, final String genre, final String actorNames, final String status) {
		final SearchVideosRequest request = new SearchVideosRequest();
		request.setSchemaVersion(1.0f);
		if ((movieName != null) && !movieName.trim().isEmpty()) {
			request.setMovieName(movieName);
		}
		if ((genre != null) && !genre.trim().isEmpty()) {
			request.setGenre(genre);
		}
		final Collection<String> deserialisedActorNames = deserialiseActorNames(actorNames);
		for (final String actorName : deserialisedActorNames) {
			request.getActorName().add(actorName);
		}
		if ((status != null) && !status.trim().isEmpty()) {
			request.setStatus(status);
		}

		final SearchVideosResponse response = (SearchVideosResponse) getService().marshalSendAndReceive(request);

		if (response.getResultCode() != 1) {
			throw new RuntimeException(response.getErrorMessage());
		}

		final Collection<MovieVideoDto> videoDtos = transform(response);
		return videoDtos;
	}

	private String serialiseActorNames(final Collection<String> deserialisedActorNames) {
		final StringBuffer serialisedActorNames = new StringBuffer();
		if (deserialisedActorNames != null) {
			for (final String individualActor : deserialisedActorNames) {
				if (serialisedActorNames.length() > 0) {
					serialisedActorNames.append(", ");
				}
				serialisedActorNames.append(individualActor);
			}
		}
		return serialisedActorNames.toString();
	}

	private Collection<String> deserialiseActorNames(final String serialisedActorNames) {
		final Collection<String> deserialisedActorNames = new HashSet<>();
		if ((serialisedActorNames != null) && !serialisedActorNames.trim().isEmpty()) {
			final String[] individualActors = serialisedActorNames.split(",");
			for (final String individualActor : individualActors) {
				deserialisedActorNames.add(individualActor.trim());
			}
		}
		return deserialisedActorNames;
	}

	private Collection<MovieVideoDto> transform(final SearchVideosResponse response) {
		final Collection<MovieVideoDto> videoDtos = new ArrayList<>();
		if (response != null) {
			for (final ServiceVideo serviceVideo : response.getVideo()) {
				final MovieVideoDto videoDto = new MovieVideoDto();
				videoDto.setName(serviceVideo.getMovie().getName());
				videoDto.setGenre(serviceVideo.getMovie().getGenre());
				videoDto.setDurationInMinutes(serviceVideo.getMovie().getDurationInMinutes());
				videoDto.setDateReleasedOnVideo(serviceVideo.getDateReleased());
				videoDto.setStatus(serviceVideo.getStatus());

				final Collection<String> mainActors = new ArrayList<>();
				for (final String actor : serviceVideo.getMovie().getActors()) {
					mainActors.add(actor);
				}
				videoDto.setMainActors(serialiseActorNames(mainActors));

				videoDtos.add(videoDto);
			}
		}
		return videoDtos;
	}

}
