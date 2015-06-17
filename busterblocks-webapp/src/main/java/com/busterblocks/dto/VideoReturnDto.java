package com.busterblocks.dto;

public final class VideoReturnDto {

	private String returnSerialNumber;
	private String comments;

	private String message;

	public String getReturnSerialNumber() {
		return returnSerialNumber;
	}

	public void setReturnSerialNumber(String returnSerialNumber) {
		this.returnSerialNumber = returnSerialNumber;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
