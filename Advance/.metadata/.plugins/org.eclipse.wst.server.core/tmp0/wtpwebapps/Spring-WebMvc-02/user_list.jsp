<%@page import="dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">User List</h1>
	<hr>

	<table align="center">

		<%
			List<User> l = (List<User>) request.getAttribute("userList");

			if (l != null) {
		%>

		<tr>
			<th>User Id</th>
			<th>User Name</th>
			<th>User Role</th>
			<th>Delete User</th>
			<th>Edit User Info</th>
		</tr>

		<%
			for (User u : l) {
		%>
		<tr>
			<td><%=u.getUserId()%></td>
			<td><%=u.getUserName()%></td>
			<td><%=u.getUserRole()%></td>
			<td><a href="delete_user.htm?userId=<%=u.getUserId()%>">Delete</a></td>
			<td><a href="select_user.htm?userId=<%=u.getUserId()%>">Edit</a></td>
		</tr>


		<%
			}
			}
		%>


	</table>


</body>
</html>