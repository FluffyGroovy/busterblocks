package com.busterblocks.video.structure.builder;

import com.busterblocks.video.structure.Movie;
import com.busterblocks.video.structure.VideoStatus;
import org.joda.time.DateTime;

import java.util.Collection;
import java.util.HashSet;

public class VideoBuilder {

	private String id;
	private Movie movie;
	private DateTime dateReleased;
	private Collection<VideoItemBuilder> itemBuilders;
	private VideoStatus status;

	public VideoBuilder(final String id, final DateTime dateReleased, final VideoStatus status) {
		setId(id);
		setDateReleased(dateReleased);
		setStatus(status);
	}

	public void add(VideoItemBuilder videoItemBuilder) {
		if (videoItemBuilder != null) {
			getItemBuilders().add(videoItemBuilder);
		}
	}

	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public Movie getMovie() {
		return movie;
	}

	private void setMovie(Movie movie) {
		this.movie = movie;
	}

	public DateTime getDateReleased() {
		return dateReleased;
	}

	private void setDateReleased(DateTime dateReleased) {
		this.dateReleased = dateReleased;
	}

	public Collection<VideoItemBuilder> getItemBuilders() {
		if (itemBuilders == null) {
			setItemBuilders(new HashSet<VideoItemBuilder>());
		}
		return itemBuilders;
	}

	private void setItemBuilders(Collection<VideoItemBuilder> itemBuilders) {
		this.itemBuilders = itemBuilders;
	}

	public VideoStatus getStatus() {
		return status;
	}

	public void setStatus(VideoStatus status) {
		this.status = status;
	}
}
