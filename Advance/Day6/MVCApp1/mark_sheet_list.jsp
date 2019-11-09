<%@page import="dto.Marksheet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.MarksheetDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	MarksheetDao mdao = new MarksheetDao();
	ArrayList<Marksheet> l = mdao.selectAll();
%>    
    
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
					<th colspan="7" >Mark Sheet List</th>
				</tr>
				<tr>
					<th>RNO</th>
					<th>NAME</th>
					<th>PHYSICS</th>
					<th>CHEMISTRY</th>
					<th>MATHS</th>
					<th>DELETE</th>
					<th>SELECT</th>
				</tr>
			</thead>
			<tbody>
				<%
					for(Marksheet m : l){
				%>
				<tr align="center" >
					<td><%=m.getRno() %></td>
					<td><%=m.getStudentName() %></td>
					<td><%=m.getPhysics() %></td>
					<td><%=m.getChemistry() %></td>
					<td><%=m.getMaths() %></td>
					<td><a href="mark_sheet_delete.jsp?rno=<%=m.getRno()%>" >Delete</a></td>
					<td><a href="mark_sheet_update_form.jsp?rno=<%=m.getRno()%>" >Select</a></td>
				</tr>
				<% }  %>
				
				
			</tbody>
		</table>
	</form>
</body>
</html>