<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags/form" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<spr:form action="reg.htm" method="post" commandName="user" >
		User Name : <spr:input path="userName" /><br>
		User Pass : <spr:password path="userPass" /><br>
		User Role : <spr:select path="userRole">
			<spr:option value="admin"></spr:option>
			<spr:option value="operator"></spr:option>
		</spr:select><br>
		<input type="submit" value="Register" /><br>
	</spr:form>
</body>
</html>