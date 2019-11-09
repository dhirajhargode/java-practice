<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mark Sheet Generation System</title>
</head>
<body>
<%@ include file="menu_user.jsp" %>
	<form action="mark_sheet_add.jsp">
		<table align="center" border="0" style="background-color: #cc8899" >
			<thead>
				<tr>
					<th>Add Mark Sheet Form</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input type="text" name="rno" placeholder="Enter rno" /></td>
				</tr>
				<tr>	
					<td><input type="text" name="studentName" placeholder="Enter Name" /></td>
				</tr>
				<tr>
					<td><input type="text" name="physics" placeholder="Enter Physics" /></td>
				</tr>
				<tr>	
					<td><input type="text" name="chemistry" placeholder="Enter Chemistry" /></td>
				</tr>
				<tr>
					<td><input type="text" name="maths" placeholder="Enter Maths" /></td>
				</tr>
				<tr>	
					<td align="right" ><input type="submit" value="Create" /></td>
				</tr>
				<tr>	
					<td align="left" ><a href="home.jsp" >Back</a></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>