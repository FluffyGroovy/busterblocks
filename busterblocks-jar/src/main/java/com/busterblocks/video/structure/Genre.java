package com.busterblocks.video.structure;

public final class Genre {

	private final String id;
	private final String description;

	public Genre(final String id, final String description) {
		this.id = id;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

}
