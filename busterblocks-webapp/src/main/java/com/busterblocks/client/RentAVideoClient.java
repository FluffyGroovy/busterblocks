package com.busterblocks.client;

import busterblocks.integration.jaxb.RentAVideoRequest;
import busterblocks.integration.jaxb.RentAVideoResponse;

public class RentAVideoClient extends BaseClient {

	public void rentAVideo(final String videoItemSerialNumber, final String customerId, final String dateDue) {
		final RentAVideoRequest request = new RentAVideoRequest();
		request.setSchemaVersion(1.0f);
		if ((videoItemSerialNumber != null) && !videoItemSerialNumber.trim().isEmpty()) {
			request.setVideoItemSerialNumber(videoItemSerialNumber);
		}
		if ((customerId != null) && !customerId.trim().isEmpty()) {
			request.setCustomerId(customerId);
		}
		if ((dateDue != null) && !dateDue.trim().isEmpty()) {
			request.setDateDue(dateDue);
		}

		final RentAVideoResponse response = (RentAVideoResponse) getService().marshalSendAndReceive(request);

		if (response.getResultCode() != 1) {
			throw new RuntimeException(response.getErrorMessage());
		}
	}

}
