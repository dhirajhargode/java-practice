<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<b>Enter Student Information</b>
	<table>
		<form:form modelAttribute="student" action="student.htm" method="POST">
			<tr>
				<td>Student ID :</td>
				<td><form:input path="sid" /></td>
			</tr>
			<tr>
				<td>Student Name :</td>
				<td><form:input path="sname" /></td>
			</tr>

			<tr>
				<td>Student Email :</td>
				<td><form:input path="semail" /></td>
			</tr>

			<tr>
				<td>Student MobileNum :</td>
				<td><form:input path="mobileNum" /></td>
			</tr>

			<tr>
				<td>Interested Courses :</td>
				<td><form:select path="courses" size="5">
						<form:option value="C">C</form:option>
						<form:option value="Java">Java</form:option>
						<form:option value=".Net">.Net</form:option>
						<form:option value="Oracle">Oracle</form:option>
					</form:select></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</form:form>
	</table>

</body>
</html>