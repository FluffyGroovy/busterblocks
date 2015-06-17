package com.busterblocks.video.structure;

public final class VideoStatus {

	public static final String IN_SERVICE = "In service";
	public static final String RETIRED = "Retired";
	public static final String BORROWED = "Borrowed";
	public static final String AVAILABLE = "Available";
	public static final String COMING_SOON = "Coming soon";
	public static final String UNKNOWN = "Unknown";

	private final String id;
	private final String description;

	public VideoStatus(final String id, final String description) {
		this.id = id;
		this.description = description;
	}

	public boolean isInService() {
		return IN_SERVICE.equals(description);
	}

	public boolean isRetired() {
		return RETIRED.equals(description);
	}

	public boolean isBorrowed() {
		return BORROWED.equals(description);
	}

	public boolean isAvailable() {
		return AVAILABLE.equals(description);
	}

	public boolean isComingSoon() {
		return COMING_SOON.equals(description);
	}

	public boolean isUnknown() {
		return UNKNOWN.equals(description);
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

}
