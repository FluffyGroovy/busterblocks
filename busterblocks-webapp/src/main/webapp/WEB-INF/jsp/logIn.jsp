<%@ include file="/WEB-INF/jsp/include/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
</head>

<body>
<div>
	<spring-form:form commandName="loginDto" method="post" action="" id="LogInForm">
		<label for="userName">User name</label>
		<div>
			<spring-form:input id="userName" path="userName"/>
		</div>

		<label for="password">Password</label>
		<div>
			<spring-form:input id="password" path="password"/>
		</div>

		<div>
			<input id="logInButton" name="LOG_IN" type="submit" value="Log in"/>
			<input id="giveUpButton" name="GIVE_UP" type="submit" value="Give up"/>
		</div>
	</spring-form:form>
</div>
</body>
</html>