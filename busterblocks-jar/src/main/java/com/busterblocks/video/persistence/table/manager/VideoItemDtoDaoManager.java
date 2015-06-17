package com.busterblocks.video.persistence.table.manager;

import com.busterblocks.video.persistence.table.dao.VideoItemDtoDAO;
import com.busterblocks.video.persistence.table.dto.VideoItemDto;
import com.busterblocks.video.persistence.table.dto.VideoItemDtoExample;

import java.util.Collection;

public class VideoItemDtoDaoManager {

	private VideoItemDtoDAO videoItemDtoDAO;

	public String retrieveVideoItemIdBySerialNumber(final String videoItemSerialNumber) {
		final VideoItemDtoExample videoItemDtoExample = new VideoItemDtoExample();
		final VideoItemDtoExample.Criteria criteria = videoItemDtoExample.createCriteria();
		criteria.andSERIAL_NUMBEREqualTo(videoItemSerialNumber);
		final Collection<VideoItemDto> result = getVideoItemDtoDAO().selectByExample(videoItemDtoExample);
		final String videoItemId = extractVideoItemId(result);
		return videoItemId;
	}

	private String extractVideoItemId(final Collection<VideoItemDto> videoItemDtos) {
		if ((videoItemDtos != null) && !videoItemDtos.isEmpty()) {
			final VideoItemDto videoItemDto = videoItemDtos.iterator().next();
			return videoItemDto.getVIDEO_ITEM_ID().toString();
		}
		return null;
	}

	private VideoItemDtoDAO getVideoItemDtoDAO() {
		return videoItemDtoDAO;
	}

	public void setVideoItemDtoDAO(VideoItemDtoDAO videoItemDtoDAO) {
		this.videoItemDtoDAO = videoItemDtoDAO;
	}
}
