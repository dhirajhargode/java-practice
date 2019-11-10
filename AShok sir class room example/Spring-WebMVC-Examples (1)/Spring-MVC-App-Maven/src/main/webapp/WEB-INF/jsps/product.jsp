<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>
		<font color='green'>${succMsg}</font>
	</h3>
	<h3>
		<font color='red'>${errMsg}</font>
	</h3>

	<h2>Enter Product Details</h2>

	<form:form action="store" method="post" modelAttribute="p">
		<table>
			<tr>
				<td>Product Id</td>
				<td><form:input path="pid" /></td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td><form:input path="pname" /></td>
			</tr>
			<tr>
				<td>Product Price</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" value="Store" /></td>
			</tr>
		</table>
	</form:form>
	
	<a href="retrieve">View All Products</a>
</body>
</html>