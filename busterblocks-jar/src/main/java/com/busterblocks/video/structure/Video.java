package com.busterblocks.video.structure;

import com.busterblocks.video.structure.builder.VideoBuilder;
import com.busterblocks.video.structure.builder.VideoItemBuilder;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Collection;

public final class Video {

	private final String id;
	private final Movie movie;
	private final DateTime dateReleased;
	private final Collection<VideoItem> items;
	private final VideoStatus status;

	public Video(final Movie movie, final VideoBuilder videoBuilder) {
		this.id = videoBuilder.getId();
		this.movie = movie;
		this.dateReleased = videoBuilder.getDateReleased();
		this.status = videoBuilder.getStatus();

		this.items = new ArrayList<>();
		for (final VideoItemBuilder videoItemBuilder : videoBuilder.getItemBuilders()) {
			this.items.add(new VideoItem(this, videoItemBuilder));
		}
	}

	public String getId() {
		return id;
	}

	public Movie getMovie() {
		return movie;
	}

	public DateTime getDateReleased() {
		return dateReleased;
	}

	public Collection<VideoItem> getItems() {
		if (items != null) {
			return new ArrayList<>(items);
		}
		return null;
	}

	public VideoStatus getStatus() {
		return status;
	}

}
