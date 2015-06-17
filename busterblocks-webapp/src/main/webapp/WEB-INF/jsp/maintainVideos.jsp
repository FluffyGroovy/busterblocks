<%@ include file="/WEB-INF/jsp/include/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
</head>

<body>
<div>
	<h1>Maintain movies</h1>
	<spring-form:form commandName="movieVideoDto" method="post" action="" id="MaintainMoviesForm">
		<label for="movieId">Movie ID</label>
		<div>
			<spring-form:input id="movieId" path="movieId"/>
		</div>

		<label for="name">Name</label>
		<div>
			<spring-form:input id="name" path="name"/>
		</div>

		<label for="genre">Genre</label>
		<div>
			<spring-form:input id="genre" path="genre"/>
		</div>

		<label for="durationInMinutes">Minutes</label>
		<div>
			<spring-form:input id="durationInMinutes" path="durationInMinutes"/>
		</div>

		<label for="mainActors">Main actors</label>
		<div>
			<spring-form:input id="mainActors" path="mainActors"/>
		</div>

		<label for="dateReleasedOnVideo">Date released on video</label>
		<div>
			<spring-form:input id="dateReleasedOnVideo" path="dateReleasedOnVideo"/>
		</div>

		<div>
			<p/>
			<input id="movieClearButton" name="MOVIE_CLEAR" type="submit" value="Clear"/>
			<input id="movieSearchButton" name="MOVIE_FIND" type="submit" value="Find"/>
			<input id="movieCreateButton" name="MOVIE_ADD" type="submit" value="Add"/>
			<input id="movieUpdateButton" name="MOVIE_UPDATE" type="submit" value="Update"/>
			<input id="movieDeleteButton" name="MOVIE_DELETE" type="submit" value="Delete"/>
			<input id="movieMainMenuButton" name="MOVIE_MAIN_MENU" type="submit" value="Main menu"/>
		</div>

		${movieVideoDto.message}
	</spring-form:form>

	<h1>Maintain videos</h1>
	<spring-form:form commandName="videoItemDto" method="post" action="" id="MaintainVideosForm">
		<label for="videoItemId">Video ID</label>
		<div>
			<spring-form:input id="videoItemId" path="videoItemId"/>
		</div>

		<label for="serialNumber">Serial number</label>
		<div>
			<spring-form:input id="serialNumber" path="serialNumber"/>
		</div>

		<label for="dateCreated">Date created</label>
		<div>
			<spring-form:input id="dateCreated" path="dateCreated"/>
		</div>

		<label for="status">Status</label>
		<div>
			<spring-form:input id="status" path="status"/>
		</div>

		<div>
			<p/>
			<input id="videoClearButton" name="VIDEO_CLEAR" type="submit" value="Clear"/>
			<input id="videoSearchButton" name="VIDEO_FIND" type="submit" value="Find"/>
			<input id="videoCreateButton" name="VIDEO_ADD" type="submit" value="Add"/>
			<input id="videoUpdateButton" name="VIDEO_UPDATE" type="submit" value="Update"/>
			<input id="videoDeleteButton" name="VIDEO_DELETE" type="submit" value="Delete"/>
			<input id="videoMainMenuButton" name="VIDEO_MAIN_MENU" type="submit" value="Main menu"/>
		</div>

		${movieVideoDto.message}
	</spring-form:form>
</div>
</body>
</html>