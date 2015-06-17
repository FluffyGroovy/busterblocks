package com.busterblocks.video.structure.builder;

import com.busterblocks.video.structure.Actor;
import com.busterblocks.video.structure.Genre;
import com.busterblocks.video.structure.Movie;
import com.busterblocks.video.structure.Video;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class MovieBuilder {

	private String id;
	private String name;
	private Genre genre;
	private Integer durationInMinutes;
	private Collection<Actor> mainActors;
	private VideoBuilder videoBuilder;

	public MovieBuilder(final String id, final String name, final Genre genre, final Integer durationInMinutes) {
		setId(id);
		setName(name);
		setGenre(genre);
		setDurationInMinutes(durationInMinutes);
	}

	public void add(Actor aMainActor) {
		getMainActors().add(aMainActor);
	}

	public Movie build() {
		return new Movie(this);
	}

	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public Genre getGenre() {
		return genre;
	}

	private void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Integer getDurationInMinutes() {
		return durationInMinutes;
	}

	private void setDurationInMinutes(Integer durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	public Collection<Actor> getMainActors() {
		if (mainActors == null) {
			setMainActors(new HashSet<Actor>());
		}
		return mainActors;
	}

	private void setMainActors(Collection<Actor> mainActors) {
		this.mainActors = mainActors;
	}

	public VideoBuilder getVideoBuilder() {
		return videoBuilder;
	}

	public void setVideoBuilder(VideoBuilder videoBuilder) {
		this.videoBuilder = videoBuilder;
	}

}
