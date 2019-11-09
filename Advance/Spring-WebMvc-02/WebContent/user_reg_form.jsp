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


	<h1 align="center">Sign Up Form</h1>

	<table align="center">
		<frm:form action="user_reg.htm" method="post" commandName="user">
			<tr>
				<th>User Id</th>
				<td><frm:input path="userId" /></td>
			</tr>
			
			<tr>
				<th>User Name</th>
				<td><frm:input path="userName" /></td>
			</tr>
			<tr>
				<th>User Pass</th>
				<td><frm:input path="passWord" /></td>
			</tr>
			<tr>
				<th>User Role</th>
				<td> <frm:select path="userRole">
						<frm:option value="admin"></frm:option>
						<frm:option value="operator"></frm:option>
					</frm:select></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit" value="Register" /></td>
			</tr>

		</frm:form>
	</table>
</body>
</html>