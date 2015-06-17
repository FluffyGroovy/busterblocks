package com.busterblocks.endpoint;

import busterblocks.integration.jaxb.ReturnAVideoRequest;
import busterblocks.integration.jaxb.ReturnAVideoResponse;
import com.busterblocks.rental.gateway.VideoRentalComponent;
import org.apache.log4j.Logger;
import org.springframework.oxm.Marshaller;
import org.springframework.util.StopWatch;
import org.springframework.ws.server.endpoint.AbstractMarshallingPayloadEndpoint;

public class ReturnAVideoEndpoint extends AbstractMarshallingPayloadEndpoint {

	private VideoRentalComponent videoRentalComponent;

	private Logger logger = Logger.getLogger(this.getClass());

	public ReturnAVideoEndpoint(Marshaller marshaller) {
		super(marshaller);
	}

	@Override
	protected Object invokeInternal(Object object) {
		final StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		final ReturnAVideoRequest request = (ReturnAVideoRequest) object;
		final String methodSignature = String.format("for serialNumber=%s, comments=%s", request.getVideoItemSerialNumber(), request.getComments());
		if (request != null) {
			logger.info(String.format("ENTER, " + methodSignature));
		}
		final ReturnAVideoResponse response = new ReturnAVideoResponse();

		try {
			if (request.getVideoItemSerialNumber() == null) {
				throw new RuntimeException("Missing parameter");
			}
			getVideoRentalComponent().returnAVideoItem(request.getVideoItemSerialNumber(), request.getComments());
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

	private VideoRentalComponent getVideoRentalComponent() {
		return videoRentalComponent;
	}

	public void setVideoRentalComponent(VideoRentalComponent videoRentalComponent) {
		this.videoRentalComponent = videoRentalComponent;
	}
}
