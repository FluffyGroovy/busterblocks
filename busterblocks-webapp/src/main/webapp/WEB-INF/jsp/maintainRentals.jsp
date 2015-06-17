<%@ include file="/WEB-INF/jsp/include/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
</head>

<body>
<div>
	<spring-form:form commandName="videoDto" method="post" action="" id="SearchVideoForm">
		<div class="form-actions">
			<input id="searchButton" name="SEARCH" type="submit" value="Search"/>
			<input id="clearButton" name="CLEAR" type="submit" value="Clear"/>
		</div>
	</spring-form:form>
</div>
</body>
</html>