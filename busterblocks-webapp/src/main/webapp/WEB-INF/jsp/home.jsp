<%@ include file="/WEB-INF/jsp/include/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
</head>

<body>
<div>
	<h1>Busterblocks Video Management System</h1>
	<spring-form:form id="homeForm" method="post" action="">
		<input id="searchVideos" name="SEARCH_VIDEOS" type="submit" value="Search videos"/></p>
		<input id="rentAVideo" name="RENT_A_VIDEO" type="submit" value="Rent a video"/></p>
		<input id="maintainMovies" name="MAINTAIN_MOVIES" type="submit" value="Maintain movies"/></p>
		<input id="maintainVideos" name="MAINTAIN_VIDEOS" type="submit" value="Maintain videos"/></p>
		<input id="maintainCustomers" name="MAINTAIN_CUSTOMERS" type="submit" value="Maintain customers"/></p>
	</spring-form:form>
</div>
</body>
</html>