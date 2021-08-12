<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>All Student Information</h3>
	<div style="text-align: center;">
		<table border="1">
			<thead>
				<tr>
					<th>Sr No.</th>
					<th>Name</th>
					<th>Email</th>
					<th>Location</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<j:forEach items="${getAllStudent}" var="stud">
					<tr>
						<td>${stud.id}</td>
						<td>${stud.name}</td>
						<td>${stud.email}</td>
						<td>${stud.location}</td>
						<td>Edit | Delete </td>
					</tr>
				</j:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>