package com.busterblocks.video.structure;

import com.busterblocks.video.structure.builder.VideoItemBuilder;
import org.joda.time.DateTime;

public final class VideoItem {

	private final String id;
	private final String serialNumber;
	private final Video video;
	private final DateTime dateCreated;
	private final VideoStatus status;

	public VideoItem(final Video video, final VideoItemBuilder videoItemBuilder) {
		this.id = videoItemBuilder.getId();
		this.serialNumber = videoItemBuilder.getSerialNumber();
		this.video = video;
		this.dateCreated = videoItemBuilder.getDateCreated();
		this.status = videoItemBuilder.getStatus();
	}

	public String getId() {
		return id;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public Video getVideo() {
		return video;
	}

	public DateTime getDateCreated() {
		return dateCreated;
	}

	public VideoStatus getStatus() {
		return status;
	}
}
