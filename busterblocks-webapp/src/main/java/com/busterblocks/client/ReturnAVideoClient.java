package com.busterblocks.client;

import busterblocks.integration.jaxb.ReturnAVideoRequest;
import busterblocks.integration.jaxb.ReturnAVideoResponse;

public class ReturnAVideoClient extends BaseClient {

	public void returnAVideo(final String videoItemSerialNumber, final String comments) {
		final ReturnAVideoRequest request = new ReturnAVideoRequest();
		request.setSchemaVersion(1.0f);
		if ((videoItemSerialNumber != null) && !videoItemSerialNumber.trim().isEmpty()) {
			request.setVideoItemSerialNumber(videoItemSerialNumber);
		}
		if ((comments != null) && !comments.trim().isEmpty()) {
			request.setComments(comments);
		}

		final ReturnAVideoResponse response = (ReturnAVideoResponse) getService().marshalSendAndReceive(request);

		if (response.getResultCode() != 1) {
			throw new RuntimeException(response.getErrorMessage());
		}
	}

}
