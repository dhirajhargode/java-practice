<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table border="1">
	<tr>
		<th>ENO</th>
		<th>ENAME</th>
		<th>JOB</th>
		<th>SALARY</th>
	</tr>
	<c:forEach var="emp" items="${emplist}">
		<tr>
			<td><c:out value="${emp.no}"></c:out></td>
			<td><c:out value="${emp.name}"></c:out></td>
			<td><c:out value="${emp.job}"></c:out></td>
			<td><c:out value="${emp.salary}"></c:out></td>
		</tr>
	</c:forEach>

</table>
