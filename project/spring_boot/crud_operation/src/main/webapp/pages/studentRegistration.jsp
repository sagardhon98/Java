<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<f:form action="/savedStudent" method="get" modelAttribute="s1">
Enter Name : <f:input path="name" />
		<br>
		<br>
Enter Email : <f:input path="email" />
		<br>
		<br>
Enter Location : <f:input path="location" />
		<br>
		<br>
		<button type="submit">Submit</button>
		<button type="reset">Reset</button>
	</f:form>
</body>
</html>