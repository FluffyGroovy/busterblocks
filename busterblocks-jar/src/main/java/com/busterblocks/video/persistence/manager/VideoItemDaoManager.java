package com.busterblocks.video.persistence.manager;

import com.busterblocks.video.persistence.table.manager.VideoItemDtoDaoManager;

public class VideoItemDaoManager {

	private VideoItemDtoDaoManager videoItemDtoDaoManager;

	public String retrieveVideoItemIdBySerialNumber(final String videoItemSerialNumber) {
		return getVideoItemDtoDaoManager().retrieveVideoItemIdBySerialNumber(videoItemSerialNumber);
	}

	private VideoItemDtoDaoManager getVideoItemDtoDaoManager() {
		return videoItemDtoDaoManager;
	}

	public void setVideoItemDtoDaoManager(VideoItemDtoDaoManager videoItemDtoDaoManager) {
		this.videoItemDtoDaoManager = videoItemDtoDaoManager;
	}
}
