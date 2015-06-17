package com.busterblocks.video.structure.builder;

import com.busterblocks.video.structure.VideoStatus;
import org.joda.time.DateTime;

public class VideoItemBuilder {

	private String id;
	private String serialNumber;
	private VideoBuilder videoBuilder;
	private DateTime dateCreated;
	private VideoStatus status;

	public VideoItemBuilder(final String id, final String serialNumber, final DateTime dateCreated, final VideoStatus status) {
		setId(id);
		setSerialNumber(serialNumber);
		setDateCreated(dateCreated);
		setStatus(status);
	}

	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	private void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public VideoBuilder getVideoBuilder() {
		return videoBuilder;
	}

	private void setVideoBuilder(VideoBuilder videoBuilder) {
		this.videoBuilder = videoBuilder;
	}

	public DateTime getDateCreated() {
		return dateCreated;
	}

	private void setDateCreated(DateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public VideoStatus getStatus() {
		return status;
	}

	private void setStatus(VideoStatus status) {
		this.status = status;
	}
}
