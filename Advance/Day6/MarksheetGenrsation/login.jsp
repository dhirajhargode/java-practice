<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mark Sheet Generation System</title>
</head>
<body>
	<form action="validate.jsp">
		<table align="center" border="0" style="background-color: #cc8899" >
			<thead>
				<tr>
					<th>Login Form</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input type="text" name="unm" placeholder="Enter user name" /></td>
				</tr>
				<tr>	
					<td><input type="text" name="upass" placeholder="Enter password" /></td>
				</tr>
				<tr>	
					<td align="right" ><input type="submit" value="Login" /></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>