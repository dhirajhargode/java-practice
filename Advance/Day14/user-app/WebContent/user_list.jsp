<%@page import="dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<% 
		List<User> list = (List<User>)request.getAttribute("ulist");
		if(list!=null){
			for(User u: list){
	%>
	
		<tr>
			<td><%=u.getUserId() %></td>
			<td><%=u.getUserName() %></td>
			<td><%=u.getUserRole() %></td>
			<td><a href="delete_user.htm?userId=<%=u.getUserId()%>" >Delete</a></td>
			<td><a href="select_user.htm?userId=<%=u.getUserId()%>" >Select</a></td>
		</tr>
	
	<% } } %>
	</table>
</body>
</html>