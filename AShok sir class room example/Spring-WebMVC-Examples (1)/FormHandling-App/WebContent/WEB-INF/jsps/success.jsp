<%@page contentType="text/html;charset = UTF-8" language="java"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
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