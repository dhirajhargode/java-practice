<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags/form" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<spr:form action="login.htm" method="post" commandName="user" >
		User Name : <spr:input path="userName" /><br>
		User Pass : <spr:password path="userPass" /><br>
		<input type="submit" value="Login" /><br>
	</spr:form>
</body>
</html>