<%@page import="dto.Marksheet"%>
<%@page import="dao.MarksheetDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	int rno = Integer.parseInt(request.getParameter("rno"));
	MarksheetDao mdao = new MarksheetDao();
	Marksheet m = mdao.selectMarksheet(rno);
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mark Sheet Generation System</title>
</head>
<body>
	<form action="mark_sheet_update.jsp">
		<table align="center" border="0" style="background-color: #cc8899" >
			<thead>
				<tr>
					<th>Update Mark Sheet Form</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input type="text" name="rno" value="<%=m.getRno() %>" readonly="readonly"  placeholder="Enter rno" /></td>
				</tr>
				<tr>	
					<td><input type="text" name="studentName" value="<%=m.getStudentName() %>" placeholder="Enter Name" /></td>
				</tr>
				<tr>
					<td><input type="text" name="physics" value="<%=m.getPhysics() %>" placeholder="Enter Physics" /></td>
				</tr>
				<tr>	
					<td><input type="text" name="chemistry" value="<%=m.getChemistry() %>" placeholder="Enter Chemistry" /></td>
				</tr>
				<tr>
					<td><input type="text" name="maths" value="<%=m.getMaths() %>" placeholder="Enter Maths" /></td>
				</tr>
				<tr>	
					<td align="right" ><input type="submit" value="Update" /></td>
				</tr>
				<tr>	
					<td align="left" ><a href="mark_sheet_list.jsp" >Back</a></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>