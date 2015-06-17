package com.busterblocks.video.persistence.manager;

import com.busterblocks.video.persistence.table.manager.MovieDtoDaoManager;
import com.busterblocks.video.structure.Movie;

import java.util.Collection;

public class MovieDaoManager {

	private MovieDtoDaoManager movieDtoDaoManager;

	public Collection<Movie> findMatchingMovies(final String movieName, final String genre, final Collection<String> actorNames, final String status) {
		return getMovieDtoDaoManager().findMatchingMovies(movieName, genre, actorNames, status);
	}

	private MovieDtoDaoManager getMovieDtoDaoManager() {
		return movieDtoDaoManager;
	}

	public void setMovieDtoDaoManager(MovieDtoDaoManager movieDtoDaoManager) {
		this.movieDtoDaoManager = movieDtoDaoManager;
	}
}
