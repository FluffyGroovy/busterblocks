package com.busterblocks.endpoint;

import busterblocks.integration.jaxb.SearchVideosRequest;
import busterblocks.integration.jaxb.SearchVideosResponse;
import busterblocks.integration.jaxb.ServiceMovie;
import busterblocks.integration.jaxb.ServiceVideo;
import com.busterblocks.video.gateway.VideoComponent;
import com.busterblocks.video.structure.Actor;
import com.busterblocks.video.structure.Movie;
import com.busterblocks.video.structure.VideoItem;
import org.apache.log4j.Logger;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.oxm.Marshaller;
import org.springframework.util.StopWatch;
import org.springframework.ws.server.endpoint.AbstractMarshallingPayloadEndpoint;

import java.util.Collection;

public class SearchVideosEndpoint extends AbstractMarshallingPayloadEndpoint {

	private VideoComponent videoComponent;

	private Logger logger = Logger.getLogger(this.getClass());

	public SearchVideosEndpoint(Marshaller marshaller) {
		super(marshaller);
	}

	@Override
	protected Object invokeInternal(Object object) {
		final StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		final SearchVideosRequest request = (SearchVideosRequest) object;
		final String methodSignature = String.format("for movie=%s, actor=%s", request.getMovieName(), request.getActorName());
		if (request != null) {
			logger.info(String.format("ENTER, " + methodSignature));
		}
		final SearchVideosResponse response = new SearchVideosResponse();

		try {
			final Collection<Movie> matchingVideoItems = getVideoComponent().findMatchingMovies(
					request.getMovieName(), request.getGenre(), request.getActorName(), request.getStatus());
			populateResponse(response, matchingVideoItems);
			response.setResultCode(1);
		} catch (Exception e) {
			logger.error(String.format("FAILED, " + methodSignature), e);
			response.setResultCode(0);
			response.setErrorMessage(e.getMessage());
		}
		response.setSchemaVersion(request.getSchemaVersion());
		logger.info("EXIT, " + methodSignature + ", time taken = " + stopwatch.getTotalTimeSeconds() + " s");
		return response;
	}

	private void populateResponse(final SearchVideosResponse response, final Collection<Movie> movies) {
		for (final Movie movie : movies) {
			final ServiceVideo serviceVideo = new ServiceVideo();
			serviceVideo.setDateReleased(movie.getVideo().getDateReleased().toString(DateTimeFormat.forPattern("dd-MM-yyyy")));
			serviceVideo.setStatus(movie.getVideo().getStatus().getDescription());

			final ServiceMovie serviceMovie = new ServiceMovie();
			serviceMovie.setName(movie.getVideo().getMovie().getName());
			serviceMovie.setGenre(movie.getVideo().getMovie().getGenre().getDescription());
			serviceMovie.setDurationInMinutes(movie.getVideo().getMovie().getDurationInMinutes());
			if (movie.getVideo().getMovie().getMainActors() != null) {
				for (final Actor actor : movie.getVideo().getMovie().getMainActors()) {
					serviceMovie.getActors().add(actor.getName());
				}
			}
			serviceVideo.setMovie(serviceMovie);

			response.getVideo().add(serviceVideo);
		}
	}

	private VideoComponent getVideoComponent() {
		return videoComponent;
	}

	public void setVideoComponent(VideoComponent videoComponent) {
		this.videoComponent = videoComponent;
	}

}
