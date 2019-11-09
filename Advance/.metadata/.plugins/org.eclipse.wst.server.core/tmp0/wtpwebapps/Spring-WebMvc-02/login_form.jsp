<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table align="center">

		<h1 align="center">Login Form</h1>
		<frm:form action="login.htm" method="post" commandName="user">
			<tr>
				<th>username :</th>
				<td><frm:input path="userName" /></td>
			</tr>
			<tr>
				<th>password :</th>
				<td><frm:password path="passWord" /></td>

			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="login"></td>
			</tr>
		</frm:form>

	</table>



</body>
</html>