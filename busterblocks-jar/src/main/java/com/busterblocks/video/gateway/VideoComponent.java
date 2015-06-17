package com.busterblocks.video.gateway;

import com.busterblocks.video.persistence.manager.MovieDaoManager;
import com.busterblocks.video.persistence.manager.VideoItemDaoManager;
import com.busterblocks.video.structure.Movie;

import java.util.Collection;

public class VideoComponent {

	private MovieDaoManager movieDaoManager;
	private VideoItemDaoManager videoItemDaoManager;

	public String retrieveVideoItemIdBySerialNumber(final String videoItemSerialNumber) {
		return getVideoItemDaoManager().retrieveVideoItemIdBySerialNumber(videoItemSerialNumber);
	}

	public Collection<Movie> findMatchingMovies(final String movieName, final String genre, final Collection<String> actorNames, final String status) {
		return getMovieDaoManager().findMatchingMovies(movieName, genre, actorNames, status);
	}

	private MovieDaoManager getMovieDaoManager() {
		return movieDaoManager;
	}

	public void setMovieDaoManager(MovieDaoManager movieDaoManager) {
		this.movieDaoManager = movieDaoManager;
	}

	private VideoItemDaoManager getVideoItemDaoManager() {
		return videoItemDaoManager;
	}

	public void setVideoItemDaoManager(VideoItemDaoManager videoItemDaoManager) {
		this.videoItemDaoManager = videoItemDaoManager;
	}
}
