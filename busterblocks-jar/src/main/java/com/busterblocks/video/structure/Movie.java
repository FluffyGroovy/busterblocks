package com.busterblocks.video.structure;

import com.busterblocks.video.structure.builder.MovieBuilder;
import com.busterblocks.video.structure.builder.VideoBuilder;

import java.util.ArrayList;
import java.util.Collection;

public final class Movie {

	private final String id;
	private final String name;
	private final Genre genre;
	private final Integer durationInMinutes;
	private final Collection<Actor> mainActors;
	private final Video video;

	public Movie(final MovieBuilder movieBuilder) {
		this.id = movieBuilder.getId();
		this.name = movieBuilder.getName();
		this.genre = movieBuilder.getGenre();
		this.durationInMinutes = movieBuilder.getDurationInMinutes();
		this.mainActors = movieBuilder.getMainActors();
		this.video = new Video(this, movieBuilder.getVideoBuilder());
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Genre getGenre() {
		return genre;
	}

	public Integer getDurationInMinutes() {
		return durationInMinutes;
	}

	public Collection<Actor> getMainActors() {
		if (mainActors != null) {
			return new ArrayList<>(mainActors);
		}
		return null;
	}

	public Video getVideo() {
		return video;
	}

}
