<%
	session.removeAttribute("myUser");
	session.invalidate();
	response.sendRedirect("index.jsp");
%>