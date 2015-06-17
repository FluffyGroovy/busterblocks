package com.busterblocks.dto;

public final class VideoRentalDto {

	private String rentSerialNumber;
	private String customerId;
	private String dateDue;

	private String message;

	public String getRentSerialNumber() {
		return rentSerialNumber;
	}

	public void setRentSerialNumber(String rentSerialNumber) {
		this.rentSerialNumber = rentSerialNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getDateDue() {
		return dateDue;
	}

	public void setDateDue(String dateDue) {
		this.dateDue = dateDue;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
