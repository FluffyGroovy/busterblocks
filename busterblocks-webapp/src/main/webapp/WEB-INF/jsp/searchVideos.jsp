<%@ include file="/WEB-INF/jsp/include/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
</head>

<body>
<div>
	<h1>Search videos</h1>
	<spring-form:form commandName="videoDto" method="post" action="" id="SearchVideosForm">
		<label for="name">Name</label>
		<div>
			<spring-form:input id="name" path="name"/>
		</div>

		<label for="genre">Genre</label>
		<div>
			<spring-form:input id="genre" path="genre"/>
		</div>

		<label for="mainActors">Main actors</label>
		<div>
			<spring-form:input id="mainActors" path="mainActors"/>
		</div>

		<label for="status">Status</label>
		<div>
			<spring-form:select id="status" path="status">
				<option>Released</option>
				<option>Forthcoming</option>
			</spring-form:select>
		</div>

		<div>
			<p/>
			<input id="clearButton" name="CLEAR" type="submit" value="Clear"/>
			<input id="searchButton" name="SEARCH" type="submit" value="Search"/>
			<input id="mainMenuButton" name="MAIN_MENU" type="submit" value="Main menu"/>
		</div>
	</spring-form:form>

	<h1> </h1>
	<h1>Matching videos</h1>
	<table>
		<tr>
			<td>
				<c:out value="name"/>
			</td>
			<td>
				<c:out value="genre"/>
			</td>
			<td>
				<c:out value="minutes"/>
			</td>
			<td>
				<c:out value="main actors"/>
			</td>
			<td>
				<c:out value="date released"/>
			</td>
			<td>
				<c:out value="status"/>
			</td>
		</tr>
		<c:forEach var="resultItem" items="${searchResults}">
			<spring-form:form commandName="videoDto" method="post" action="" id="SearchResultsForm">
				<tr>
					<td>
						<c:out value="${resultItem.name}"/>
					</td>
					<td>
						<c:out value="${resultItem.genre}"/>
					</td>
					<td>
						<c:out value="${resultItem.durationInMinutes}"/>
					</td>
					<td>
						<c:out value="${resultItem.mainActors}"/>
					</td>
					<td>
						<c:out value="${resultItem.dateReleasedOnVideo}"/>
					</td>
					<td>
						<c:out value="${resultItem.status}"/>
					</td>
<%--
					<td>
						<input name="SELECTED_VIDEO" type="submit" value="Select">
						<input name="selectedVideo" type="hidden" value="${resultItem}">
					</td>
--%>
				</tr>
			</spring-form:form>
		</c:forEach>
	</table>
</div>
</body>
</html>