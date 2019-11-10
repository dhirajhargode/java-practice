<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<hr> Hi ${user.username} , your registration is successfully completed . please review your details..<hr>

<table>
	<tr>
		<td>User name </td>
		<td>${user.username}</td>
	</tr>
	<tr>
		<td>Password</td>
		<td>${user.password }</td>
	</tr>
	<tr>
		<td>Email</td>
		<td>${user.email }</td>
	</tr>
	<tr>
		<td>Mobile No</td>
		<td>${user.mobno }</td>
	</tr>
	<tr>
		<td>Gender</td>
		<td>${user.gender }</td>
	</tr>
	<tr>
		<td>Interseted Courses</td>
		<td>${user.intrestedcourses }</td>
	</tr>
	<tr>
		<td>Prefferable Timings</td>
		<td>${user.preftimings }</td>
	</tr>
	
	
</table> 


</body>
</html>