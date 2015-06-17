<%@ include file="/WEB-INF/jsp/include/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
</head>

<body>
<div>
	<h1>Maintain customers</h1>
	<spring-form:form commandName="customerDto" method="post" action="" id="MaintainCustomersForm">
		<label for="id">Customer ID</label>
		<div>
			<spring-form:input id="id" path="id"/>
		</div>

		<label for="firstName">First name</label>
		<div>
			<spring-form:input id="firstName" path="firstName"/>
		</div>

		<label for="surname">Surname</label>
		<div>
			<spring-form:input id="surname" path="surname"/>
		</div>

		<label for="contactNumber">Contact number</label>
		<div>
			<spring-form:input id="contactNumber" path="contactNumber"/>
		</div>

		<label for="idNumber">ID number</label>
		<div>
			<spring-form:input id="idNumber" path="idNumber"/>
		</div>

		<div>
			<p/>
			<input id="clearButton" name="CLEAR" type="submit" value="Clear"/>
			<input id="searchButton" name="FIND" type="submit" value="Find"/>
			<input id="createButton" name="ADD" type="submit" value="Add"/>
			<input id="updateButton" name="UPDATE" type="submit" value="Update"/>
			<input id="deleteButton" name="DELETE" type="submit" value="Delete"/>
			<input id="mainMenuButton" name="MAIN_MENU" type="submit" value="Main menu"/>
		</div>

		${customerDto.message}
	</spring-form:form>
</div>
</body>
</html>