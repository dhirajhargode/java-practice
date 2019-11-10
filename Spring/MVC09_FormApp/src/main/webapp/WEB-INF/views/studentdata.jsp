<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Submitted Student Information</h2>
	<table>
		<tr>
			<td>Student Id :</td>
			<td>${sid}</td>
		</tr>
		<tr>
			<td>Student Name :</td>
			<td>${sname}</td>
		</tr>
		<tr>
			<td>Student Email :</td>
			<td>${semail}</td>
		</tr>
		<tr>
			<td>Student mobileNum :</td>
			<td>${mobileNum}</td>
		</tr>
		<tr>
			<td>Interested Courses :</td>
			<td>${courses}</td>
		</tr>
	</table>
</body>
</html>