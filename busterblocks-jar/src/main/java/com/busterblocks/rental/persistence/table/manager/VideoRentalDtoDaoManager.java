package com.busterblocks.rental.persistence.table.manager;

import com.busterblocks.rental.persistence.table.dao.VideoRentalDtoDAO;
import com.busterblocks.rental.persistence.table.dto.LastVideoRentalViewDto;
import com.busterblocks.rental.persistence.table.dto.LastVideoRentalViewDtoExample;
import com.busterblocks.rental.persistence.table.dto.VideoRentalDto;
import com.busterblocks.rental.persistence.table.dto.VideoRentalDtoExample;
import com.busterblocks.util.GenericSequenceDtoDaoManager;
import com.busterblocks.video.gateway.VideoComponent;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Collection;

public class VideoRentalDtoDaoManager {

	private VideoRentalDtoDAO videoRentalDtoDAO;
	private LastVideoRentalDtoDaoManager lastVideoRentalDtoDaoManager;
	private GenericSequenceDtoDaoManager genericSequenceDtoDaoManager;
	private VideoComponent videoComponent;

	public void insertVideoRental(final String videoItemSerialNumber, final String customerId, final DateTime dateDue) {
		final String videoItemId = getVideoComponent().retrieveVideoItemIdBySerialNumber(videoItemSerialNumber);
		final LastVideoRentalViewDto lastVideoRentalViewDto = getLastVideoRentalDtoDaoManager().retrieveLastRentalDto(videoItemId);
		if ((lastVideoRentalViewDto != null) && (lastVideoRentalViewDto.getDATE_RETURNED() == null)) {
			throw new RuntimeException("Video item is currently rented out");
		}

		final VideoRentalDto videoRentalDto = new VideoRentalDto();
		final Long videoRentalId = getGenericSequenceDtoDaoManager().generateNewSequenceId();
		videoRentalDto.setVIDEO_RENTAL_ID(new BigDecimal(videoRentalId));
		videoRentalDto.setVIDEO_ITEM_ID(new BigDecimal(videoItemId));
		videoRentalDto.setCUSTOMER_ID(new BigDecimal(customerId));
		videoRentalDto.setDATE_BORROWED(new DateTime().toDate());
		if (dateDue != null) {
			videoRentalDto.setDATE_DUE(dateDue.toDate());
		}
		getVideoRentalDtoDAO().insert(videoRentalDto);
	}

	public void updateVideoRental(final String videoItemSerialNumber, final String comments) {
		final String videoItemId = getVideoComponent().retrieveVideoItemIdBySerialNumber(videoItemSerialNumber);
		final LastVideoRentalViewDto lastVideoRentalViewDto = getLastVideoRentalDtoDaoManager().retrieveLastRentalDto(videoItemId);
		if ((lastVideoRentalViewDto == null) || (lastVideoRentalViewDto.getDATE_RETURNED() != null)) {
			throw new RuntimeException("Video item is not currently rented out");
		}

		final VideoRentalDto videoRentalDto = new VideoRentalDto();
		videoRentalDto.setVIDEO_RENTAL_ID(lastVideoRentalViewDto.getVIDEO_RENTAL_ID());
		videoRentalDto.setVIDEO_ITEM_ID(lastVideoRentalViewDto.getVIDEO_ITEM_ID());
		videoRentalDto.setCUSTOMER_ID(lastVideoRentalViewDto.getCUSTOMER_ID());
		videoRentalDto.setDATE_BORROWED(lastVideoRentalViewDto.getDATE_BORROWED());
		videoRentalDto.setDATE_DUE(lastVideoRentalViewDto.getDATE_DUE());
		videoRentalDto.setDATE_RETURNED(new DateTime().toDate());
		videoRentalDto.setCOMMENTS(comments);
		getVideoRentalDtoDAO().updateByPrimaryKey(videoRentalDto);
	}

	private VideoRentalDtoDAO getVideoRentalDtoDAO() {
		return videoRentalDtoDAO;
	}

	public void setVideoRentalDtoDAO(VideoRentalDtoDAO videoRentalDtoDAO) {
		this.videoRentalDtoDAO = videoRentalDtoDAO;
	}

	private LastVideoRentalDtoDaoManager getLastVideoRentalDtoDaoManager() {
		return lastVideoRentalDtoDaoManager;
	}

	public void setLastVideoRentalDtoDaoManager(LastVideoRentalDtoDaoManager lastVideoRentalDtoDaoManager) {
		this.lastVideoRentalDtoDaoManager = lastVideoRentalDtoDaoManager;
	}

	private GenericSequenceDtoDaoManager getGenericSequenceDtoDaoManager() {
		return genericSequenceDtoDaoManager;
	}

	public void setGenericSequenceDtoDaoManager(GenericSequenceDtoDaoManager genericSequenceDtoDaoManager) {
		this.genericSequenceDtoDaoManager = genericSequenceDtoDaoManager;
	}

	private VideoComponent getVideoComponent() {
		return videoComponent;
	}

	public void setVideoComponent(VideoComponent videoComponent) {
		this.videoComponent = videoComponent;
	}
}
