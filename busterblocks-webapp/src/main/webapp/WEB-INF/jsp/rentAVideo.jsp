<%@ include file="/WEB-INF/jsp/include/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
</head>

<body>
<div>
	<h1>Rent a video</h1>
	<spring-form:form commandName="videoRentalDto" method="post" action="" id="RentAVideoForm">
		<label for="rentSerialNumber">Video serial number</label>
		<div>
			<spring-form:input id="rentSerialNumber" path="rentSerialNumber"/>
		</div>

		<label for="customerId">Customer ID</label>
		<div>
			<spring-form:input id="customerId" path="customerId"/>
		</div>

		<label for="dateDue">Due date</label>
		<div>
			<spring-form:input id="dateDue" path="dateDue"/>
		</div>

		<div>
			<p/>
			<input id="rentClearButton" name="RENT_CLEAR" type="submit" value="Clear"/>
			<input id="rentButton" name="RENT" type="submit" value="Rent"/>
			<input id="rentMainMenuButton" name="RENT_MAIN_MENU" type="submit" value="Main menu"/>
		</div>

		${videoRentalDto.message}
	</spring-form:form>

	<h1>Return a video</h1>
	<spring-form:form commandName="videoReturnDto" method="post" action="" id="ReturnAVideoForm">
		<label for="returnSerialNumber">Video serial number</label>
		<div>
			<spring-form:input id="returnSerialNumber" path="returnSerialNumber"/>
		</div>

		<label for="comments">Comments</label>
		<div>
			<spring-form:input id="comments" path="comments"/>
		</div>

		<div>
			<p/>
			<input id="returnClearButton" name="RETURN_CLEAR" type="submit" value="Clear"/>
			<input id="returnButton" name="RETURN" type="submit" value="Return"/>
			<input id="returnMainMenuButton" name="RETURN_MAIN_MENU" type="submit" value="Main menu"/>
		</div>

		${videoReturnDto.message}
	</spring-form:form>
</div>
</body>
</html>