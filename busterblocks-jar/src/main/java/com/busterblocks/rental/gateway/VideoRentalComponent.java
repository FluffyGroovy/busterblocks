package com.busterblocks.rental.gateway;

import com.busterblocks.rental.persistence.manager.LastVideoRentalDaoManager;
import com.busterblocks.rental.persistence.manager.VideoRentalDaoManager;
import com.busterblocks.rental.structure.VideoRental;
import org.joda.time.DateTime;

import java.util.Collection;
import java.util.Map;

public class VideoRentalComponent {

	private VideoRentalDaoManager videoRentalDaoManager;
	private LastVideoRentalDaoManager lastVideoRentalDaoManager;

	public void rentAVideoItem(final String videoItemSerialNumber, final String customerId, final DateTime dateDue) {
		getVideoRentalDaoManager().rentAVideoItem(videoItemSerialNumber, customerId, dateDue);
	}

	public void returnAVideoItem(final String videoItemSerialNumber, final String comments) {
		getVideoRentalDaoManager().returnAVideoItem(videoItemSerialNumber, comments);
	}

	public Map<String, VideoRental> retrieveLastRentals(final Collection<String> videoItemIds) {
		return getLastVideoRentalDaoManager().retrieveLastRentals(videoItemIds);
	}

	private VideoRentalDaoManager getVideoRentalDaoManager() {
		return videoRentalDaoManager;
	}

	public void setVideoRentalDaoManager(VideoRentalDaoManager videoRentalDaoManager) {
		this.videoRentalDaoManager = videoRentalDaoManager;
	}

	private LastVideoRentalDaoManager getLastVideoRentalDaoManager() {
		return lastVideoRentalDaoManager;
	}

	public void setLastVideoRentalDaoManager(LastVideoRentalDaoManager lastVideoRentalDaoManager) {
		this.lastVideoRentalDaoManager = lastVideoRentalDaoManager;
	}

}
