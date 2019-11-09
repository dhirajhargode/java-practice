<%@page import="dto.Marksheet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	Marksheet m = new Marksheet();
	
	String p1 = request.getParameter("rno");
	String p2 = request.getParameter("name");
	String p3 = request.getParameter("phy");
	String p4 = request.getParameter("chem");
	String p5 = request.getParameter("math");
	
	m.setRno(Integer.parseInt(p1));
	m.setStudentName(p2);
	m.setPhysics(Float.parseFloat(p3));
	m.setChemistry(Float.parseFloat(p4));
	m.setMaths(Float.parseFloat(p5));

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mark Sheet Generation System</title>
</head>
<body>
	
		<table align="center" border="0" style="background-color: #cc8899" >
			<thead>
				<tr>
					<th>Marksheet Info</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><%=m.getRno()%></td>
				</tr>
				<tr>
					<td><%=m.getStudentName()%></td>
				</tr>
				<tr>
					<td><%=m.getPhysics()%></td>
				</tr>
				<tr>
					<td><%=m.getChemistry()%></td>
				</tr>
				<tr>
					<td><%=m.getMaths()%></td>
				</tr>
				
			</tbody>
		</table>
	
</body>
</html>