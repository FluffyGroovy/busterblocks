package com.busterblocks.endpoint;

import busterblocks.integration.jaxb.MaintainCustomerRequest;
import busterblocks.integration.jaxb.MaintainCustomerResponse;
import org.apache.log4j.Logger;
import org.springframework.oxm.Marshaller;
import org.springframework.util.StopWatch;
import org.springframework.ws.server.endpoint.AbstractMarshallingPayloadEndpoint;

public class MaintainVideoItemEndpoint extends AbstractMarshallingPayloadEndpoint {

	private Logger logger = Logger.getLogger(this.getClass());

	public MaintainVideoItemEndpoint(Marshaller marshaller) {
		super(marshaller);
	}

	@Override
	protected Object invokeInternal(Object object) {
		final StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		final MaintainCustomerRequest request = (MaintainCustomerRequest) object;
		final String methodSignature = String.format("for firstName=%s, surname=%s, contactNumber=%s, idNumber=%s", request.getCustomer().getFirstName(), request.getCustomer().getSurname(), request.getCustomer().getContactNumber(), request.getCustomer().getIdNumber());
		if (request != null) {
			logger.info(String.format("ENTER, " + methodSignature));
		}
		final MaintainCustomerResponse response = new MaintainCustomerResponse();

		try {
//			final Collection<VideoItem> matchingVideoItems = getVideoComponent().findMatchingMovies(request.getMovieName(), request.getActorName());
//			populateResponse(response, matchingVideoItems);
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

}
