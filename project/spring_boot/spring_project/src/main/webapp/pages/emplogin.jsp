<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<f:form action="empsave" method="post" modelAttribute="el">

<table border="1">
<tr>
<td align="center">Employee Login form</td>
</tr>
<tr>
<td>Name : <f:input type="text" path="empName"/></td>
</tr>
<tr>
<td>Email : <f:input type="email" path="email"/></td>
</tr>
<tr>
<td>Phone No : <f:input type="number" path="mobile"/></td>
</tr>
<tr>
<td>Address : <f:textarea rows="5" cols="20" path="address"/></td>
</tr>
<tr>
<td align="center"><input type="submit" value="login"> <input type="reset" value="Reset"></td>
</tr>
</table>

</f:form>

</body>
</html>