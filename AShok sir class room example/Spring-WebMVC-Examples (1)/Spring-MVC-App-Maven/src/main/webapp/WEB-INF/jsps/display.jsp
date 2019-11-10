<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>View Product Details</h2>
	<a href="displayForm">Add New Product</a>
	<table border="1">
		<thead>
			<tr>
				<th>S.No</th>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Product Price</th>
				<th>Action</th>
			</tr>

		</thead>
		<tbody>
			<c:forEach items="${pList}" var="p" varStatus="counter">
				<tr>
					<td><c:out value="${counter.index+1}" /></td>
					<td><c:out value="${p.pid}" /></td>
					<td><c:out value="${p.pname}" /></td>
					<td><c:out value="${p.price}" /></td>
					<td><a href="editProduct?pid=${p.pid}">Edit</a>/ <a
						href="deleteProduct?pid=${p.pid}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<a href="exportDataToExcel">Export Data To Excel</a>
</body>
</html>