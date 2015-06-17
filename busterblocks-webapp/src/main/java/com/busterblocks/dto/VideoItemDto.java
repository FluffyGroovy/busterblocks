package com.busterblocks.dto;

public final class VideoItemDto {

	private String videoItemId;
	private String serialNumber;
	private String videoId;
	private String dateCreated;
	private String status;

	private String message;

	public String getVideoItemId() {
		return videoItemId;
	}

	public void setVideoItemId(String videoItemId) {
		this.videoItemId = videoItemId;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
