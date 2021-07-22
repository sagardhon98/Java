<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="save" method="post" modelAttribute="s1">
<table border="1">
<tr>
<td align="center">Student Registration Form</td>
</tr>
<tr>
<td>Full Name : <input type="text" name="name"></td>
</tr>
<tr>
<td>Username : <input type="text" name="username"></td>
</tr>
<tr>
<td>Password : <input type="password" name="password"></td>
</tr>
<tr>
<td>Email : <input type="email" name="email"></td>
</tr>
<tr>
<td>Date of Birth : <input type="date" name ="dob"></td>
</tr>
<tr>
<td>
Gender : <input type="radio" name="gender" value="male">Male
		 <input type="radio" name="gender" value="female">Female
</td>
</tr>
<tr>
<td>Contact Number : <input type="number" name="phn"></td>
</tr>
<tr>
<td>Address : <textarea cols="10" rows="5" name="address"></textarea></td>
</tr>
<tr>
<td>
Language : <input type="checkbox" name="language" value="marathi">Marathi
		   <input type="checkbox" name="language" value="hindi">Hindi
		   <input type="checkbox" name="language" value="english">English
</td>
</tr>
<tr>
<td>
Education : <select name="education">
				<option value="0">-- Select --</option>
				<option value="SSC">SSC</option>
				<option value="HSC">HSC</option>
				<option value="Graduation">Graduation</option>
				<option value="Post Graduation">Post Graduation</option>
			</select>
</td>
</tr>
<tr>
<td align="center"><input type="submit" value="Login"> <input type="reset" value="Reset"></td>
</tr>
</table>
</form>


</body>
</html>