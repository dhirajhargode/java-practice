<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
td {
	font: bold;
	color: red;
}
</style>
</head>
<body>
	<h2>Registration form</h2>
	<form:form action="register" method="post" modelAttribute="user">
		<table>
			<tr>
				<td>User Name :</td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:input path="password" maxlength="5" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Mobile No :</td>
				<td><form:input path="mobno" /></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><form:radiobuttons path="gender" items="${genders}" /></td>
			</tr>
			<tr>
				<td>interested Courses :</td>
				<td><form:select path="intrestedcourses" items="${courses}" /></td>
			</tr>
			<tr>
				<td>Prefarrable Timings:</td>
				<td><form:checkboxes path="preftimings" items="${timings}" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Register">
					&nbsp;&nbsp;&nbsp; <input type="reset" value="Clear">
		</table>

	</form:form>
</body>
</html>