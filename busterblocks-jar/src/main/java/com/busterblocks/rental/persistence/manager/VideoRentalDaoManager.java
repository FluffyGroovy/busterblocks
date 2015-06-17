package com.busterblocks.rental.persistence.manager;

import com.busterblocks.rental.persistence.table.manager.VideoRentalDtoDaoManager;
import org.joda.time.DateTime;

public class VideoRentalDaoManager {

	private VideoRentalDtoDaoManager videoRentalDtoDaoManager;

	public void rentAVideoItem(final String videoItemSerialNumber, final String customerId, final DateTime dateDue) {
		getVideoRentalDtoDaoManager().insertVideoRental(videoItemSerialNumber, customerId, dateDue);
	}

	public void returnAVideoItem(final String videoItemSerialNumber, final String comments) {
		getVideoRentalDtoDaoManager().updateVideoRental(videoItemSerialNumber, comments);
	}

	private VideoRentalDtoDaoManager getVideoRentalDtoDaoManager() {
		return videoRentalDtoDaoManager;
	}

	public void setVideoRentalDtoDaoManager(VideoRentalDtoDaoManager videoRentalDtoDaoManager) {
		this.videoRentalDtoDaoManager = videoRentalDtoDaoManager;
	}
}
