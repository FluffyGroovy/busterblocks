package com.busterblocks.rental.persistence.manager;

import com.busterblocks.rental.persistence.table.manager.LastVideoRentalDtoDaoManager;
import com.busterblocks.rental.structure.VideoRental;

import java.util.Collection;
import java.util.Map;

public class LastVideoRentalDaoManager {

	private LastVideoRentalDtoDaoManager lastVideoRentalDtoDaoManager;

	public Map<String, VideoRental> retrieveLastRentals(final Collection<String> videoItemIds) {
		return getLastVideoRentalDtoDaoManager().retrieveLastRentals(videoItemIds);
	}

	private LastVideoRentalDtoDaoManager getLastVideoRentalDtoDaoManager() {
		return lastVideoRentalDtoDaoManager;
	}

	public void setLastVideoRentalDtoDaoManager(LastVideoRentalDtoDaoManager lastVideoRentalDtoDaoManager) {
		this.lastVideoRentalDtoDaoManager = lastVideoRentalDtoDaoManager;
	}

}
