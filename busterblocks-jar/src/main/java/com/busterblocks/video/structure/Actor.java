package com.busterblocks.video.structure;

public final class Actor {

	private final String id;
	private final String name;

	public Actor(final String id, final String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
