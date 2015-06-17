package com.busterblocks.rental.structure;

import com.busterblocks.customer.structure.Customer;
import com.busterblocks.video.structure.VideoItem;
import org.joda.time.DateTime;

public final class VideoRental {

	public static final int DEFAULT_RENTAL_DURATION_IN_DAYS = 1;

	private final String id;
	private final VideoItem videoItem;
	private final Customer customer;
	private final DateTime dateBorrowed;
	private final DateTime dateDue;
	private final DateTime dateReturned;
	private final String comments;

	public VideoRental(final String id, final VideoItem videoItem, final Customer customer, final DateTime dateBorrowed, final DateTime dateDue, final DateTime dateReturned, final String comments) {
		this.id = id;
		this.videoItem = videoItem;
		this.customer = customer;
		this.dateBorrowed = dateBorrowed;
		this.dateDue = dateDue;
		this.dateReturned = dateReturned;
		this.comments = comments;
	}

	public DateTime getEffectiveExpectedReturnDate() {
		if (dateDue != null) {
			return dateDue;
		} else if (dateBorrowed != null) {
			return dateBorrowed.plusDays(DEFAULT_RENTAL_DURATION_IN_DAYS);
		} else {
			return null;
		}
	}

	public String getId() {
		return id;
	}

	public VideoItem getVideoItem() {
		return videoItem;
	}

	public Customer getCustomer() {
		return customer;
	}

	public DateTime getDateBorrowed() {
		return dateBorrowed;
	}

	public DateTime getDateDue() {
		return dateDue;
	}

	public DateTime getDateReturned() {
		return dateReturned;
	}

	public String getComments() {
		return comments;
	}
}
