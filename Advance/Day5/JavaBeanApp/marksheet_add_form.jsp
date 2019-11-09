<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mark Sheet Generation System</title>
</head>
<body>
	<form action="marksheet_add.jsp">
		<table align="center" border="0" style="background-color: #cc8899" >
			<thead>
				<tr>
					<th>Add Marksheet Form</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input type="text" name="rno" placeholder="Enter roll no" /></td>
				</tr>
				<tr>	
					<td><input type="text" name="name" placeholder="Enter name" /></td>
				</tr>
				<tr>
					<td><input type="text" name="phy" placeholder="Enter phy marks" /></td>
				</tr>
				<tr>	
					<td><input type="text" name="chem" placeholder="Enter chem marks" /></td>
				</tr>
				<tr>
					<td><input type="text" name="math" placeholder="Enter maths marks" /></td>
				</tr>
				
				<tr>	
					<td align="right" ><input type="submit" value="Create" /></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>