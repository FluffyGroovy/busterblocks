package com.busterblocks.endpoint;

import busterblocks.integration.jaxb.MaintainMovieVideoRequest;
import busterblocks.integration.jaxb.MaintainMovieVideoResponse;
import org.apache.log4j.Logger;
import org.springframework.oxm.Marshaller;
import org.springframework.util.StopWatch;
import org.springframework.ws.server.endpoint.AbstractMarshallingPayloadEndpoint;

public class MaintainMovieVideoEndpoint extends AbstractMarshallingPayloadEndpoint {

	private Logger logger = Logger.getLogger(this.getClass());

	public MaintainMovieVideoEndpoint(Marshaller marshaller) {
		super(marshaller);
	}

	@Override
	protected Object invokeInternal(Object object) {
		final StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		final MaintainMovieVideoRequest request = (MaintainMovieVideoRequest) object;
//		final String methodSignature = String.format("for firstName=%s, surname=%s, contactNumber=%s, idNumber=%s", request.getCustomer().getFirstName(), request.getCustomer().getSurname(), request.getCustomer().getContactNumber(), request.getCustomer().getIdNumber());
//		if (request != null) {
//			logger.info(String.format("ENTER, " + methodSignature));
//		}
		final MaintainMovieVideoResponse response = new MaintainMovieVideoResponse();

		try {
//			final Collection<VideoItem> matchingVideoItems = getVideoComponent().findMatchingMovies(request.getMovieName(), request.getActorName());
//			populateResponse(response, matchingVideoItems);
			response.setResultCode(1);
		} catch (Exception e) {
//			logger.error(String.format("FAILED, " + methodSignature), e);
			response.setResultCode(0);
			response.setErrorMessage(e.getMessage());
		}
		response.setSchemaVersion(request.getSchemaVersion());
//		logger.info("EXIT, " + methodSignature + ", time taken = " + stopwatch.getTotalTimeSeconds() + " s");
		return response;
	}

}
