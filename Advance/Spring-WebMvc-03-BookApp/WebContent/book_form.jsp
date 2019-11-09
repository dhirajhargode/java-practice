<%@page import="dao.BookDao"%>
<%@page import="java.util.List"%>
<%@page import="dto.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1 align="center">Add Book Details</h1>
	<table align="center">
		<frm:form method="post" commandName="book" action="add_book.htm">
			<tr>
				<th align="right">Book Id:</th>
				<td><frm:input path="bookId"></frm:input></td>
			</tr>

			<tr>
				<th align="right">Book Title:</th>
				<td><frm:input path="bookTitle"></frm:input></td>
			</tr>

			<tr>
				<th align="right">Author :</th>
				<td><frm:input path="author"></frm:input></td>
			</tr>

			<tr>
				<th align="right">Rack No:</th>
				<td><frm:input path="rackNo"></frm:input></td>
			</tr>

			<tr>
				<th align="right">Shelf No:</th>
				<td><frm:input path="shelfNo"></frm:input></td>
			</tr>


			<tr>
				<td colspan="2" align="right"><input type="submit" value="add" /></td>
			</tr>
		</frm:form>
	</table>
	<table align="center">
		<h2 align="center">Search Book</h2>
		<tr>
			<th>Book Title:
			</td>
			<td><input type="text" name="sb" /></td>
			<td><a href="search_book.htm?bookTitle=<%= request.getParameter("sb") %>"><input
					type="button" value="search"></a></td>
		</tr>
		<form>
	</table>

</body>
</html>