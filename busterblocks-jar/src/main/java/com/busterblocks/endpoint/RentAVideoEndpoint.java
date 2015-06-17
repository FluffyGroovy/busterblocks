package com.busterblocks.endpoint;

import busterblocks.integration.jaxb.RentAVideoRequest;
import busterblocks.integration.jaxb.RentAVideoResponse;
import com.busterblocks.rental.gateway.VideoRentalComponent;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.oxm.Marshaller;
import org.springframework.util.StopWatch;
import org.springframework.ws.server.endpoint.AbstractMarshallingPayloadEndpoint;

public class RentAVideoEndpoint extends AbstractMarshallingPayloadEndpoint {

	private VideoRentalComponent videoRentalComponent;

	private Logger logger = Logger.getLogger(this.getClass());

	public RentAVideoEndpoint(Marshaller marshaller) {
		super(marshaller);
	}

	@Override
	protected Object invokeInternal(Object object) {
		final StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		final RentAVideoRequest request = (RentAVideoRequest) object;
		final String methodSignature = String.format("for serialNumber=%s, customerId=%s, dateDue=%s", request.getVideoItemSerialNumber(), request.getCustomerId(), request.getDateDue());
		if (request != null) {
			logger.info(String.format("ENTER, " + methodSignature));
		}
		final RentAVideoResponse response = new RentAVideoResponse();

		try {
			if ((request.getVideoItemSerialNumber() == null) || (request.getCustomerId() == null)) {
				throw new RuntimeException("Missing parameter");
			}
			final DateTime dateDue = (request.getDateDue() != null)? DateTimeFormat.forPattern("dd-MM-yyyy").parseDateTime(request.getDateDue()) : null;
			getVideoRentalComponent().rentAVideoItem(request.getVideoItemSerialNumber(), request.getCustomerId(), dateDue);
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
