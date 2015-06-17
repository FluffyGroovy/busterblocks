package com.busterblocks.client;

public class MaintainVideoClient extends BaseClient {
/*

	public Collection<VideoDto> retrieveVideos(final VideoDto videoDto) {
		final MaintainVideoRequest request = new MaintainVideoRequest();
		request.setSchemaVersion(1.0f);
		request.setCommand(MaintainCommand.RETRIEVE);
		final ServiceVideo serviceVideo = new ServiceVideo();
		final ServiceMovie serviceMovie = new ServiceMovie();
		serviceMovie.setName(videoDto.getName());
		serviceMovie.getActors().addAll(videoDto.getMainActors());
		serviceVideo.setMovie(serviceMovie);
		serviceVideo.setStatus(videoDto.getStatus());
		request.setVideo(serviceVideo);

		final MaintainVideoResponse response = (MaintainVideoResponse) getService().marshalSendAndReceive(request);

		if (response.getResultCode() != 1) {
			throw new RuntimeException(response.getErrorMessage());
		}

		final Collection<VideoDto> videoDtos = transform(response);
		return videoDtos;
	}

	public VideoDto createVideo(final VideoDto videoDto) {
		final MaintainVideoRequest request = new MaintainVideoRequest();
		request.setSchemaVersion(1.0f);
		request.setCommand(MaintainCommand.CREATE);
		final ServiceVideo serviceVideo = new ServiceVideo();
		final ServiceMovie serviceMovie = new ServiceMovie();
		serviceMovie.setGenre(videoDto.getGenre());
		serviceMovie.setDurationInMinutes(videoDto.getDurationInMinutes());
		serviceMovie.getActors().addAll(videoDto.getMainActors());
		serviceVideo.setMovie(serviceMovie);
		serviceVideo.setDateReleased(videoDto.getDateReleasedOnVideo());
		serviceVideo.setStatus(videoDto.getStatus());
		request.setVideo(serviceVideo);

		final MaintainVideoResponse response = (MaintainVideoResponse) getService().marshalSendAndReceive(request);

		if (response.getResultCode() != 1) {
			throw new RuntimeException(response.getErrorMessage());
		}

		final Collection<VideoDto> videoDtos = transform(response);
		return videoDtos.iterator().next();
	}

	public void updateVideo(final VideoDto videoDto) {
		final MaintainVideoRequest request = new MaintainVideoRequest();
		request.setSchemaVersion(1.0f);
		request.setCommand(MaintainCommand.UPDATE);
		final ServiceVideo serviceVideo = new ServiceVideo();
		final ServiceMovie serviceMovie = new ServiceMovie();
		serviceMovie.setGenre(videoDto.getGenre());
		serviceMovie.setDurationInMinutes(videoDto.getDurationInMinutes());
		serviceMovie.getActors().addAll(videoDto.getMainActors());
		serviceVideo.setMovie(serviceMovie);
		serviceVideo.setDateReleased(videoDto.getDateReleasedOnVideo());
		serviceVideo.setStatus(videoDto.getStatus());
		request.setVideo(serviceVideo);

		final MaintainVideoResponse response = (MaintainVideoResponse) getService().marshalSendAndReceive(request);

		if (response.getResultCode() != 1) {
			throw new RuntimeException(response.getErrorMessage());
		}
	}

	public void deleteVideo(final String videoId) {
		final MaintainVideoRequest request = new MaintainVideoRequest();
		request.setSchemaVersion(1.0f);
		request.setCommand(MaintainCommand.DELETE);
		final ServiceVideo serviceVideo = new ServiceVideo();
		serviceVideo.setId(videoId);
		request.setVideo(serviceVideo);

		final MaintainVideoResponse response = (MaintainVideoResponse) getService().marshalSendAndReceive(request);

		if (response.getResultCode() != 1) {
			throw new RuntimeException(response.getErrorMessage());
		}
	}

	private Collection<VideoDto> transform(final MaintainVideoResponse response) {
		final Collection<VideoDto> videoDtos = new ArrayList<>();
		if (response != null) {
			for (final ServiceVideo serviceVideo : response.getVideo()) {
				final VideoDto videoDto = new VideoDto();
				videoDto.setName(serviceVideo.getMovie().getName());
				videoDto.setGenre(serviceVideo.getMovie().getGenre());
				videoDto.setDurationInMinutes(serviceVideo.getMovie().getDurationInMinutes());
				videoDto.setMainActors(serviceVideo.getMovie().getActors());
				videoDto.setDateReleasedOnVideo(serviceVideo.getDateReleased());
				videoDto.setStatus(serviceVideo.getStatus());
				videoDtos.add(videoDto);
			}
		}
		return videoDtos;
	}

*/
}
