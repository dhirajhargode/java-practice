<%@page import="dao.LoginDao"%>
<jsp:useBean id="user" class="dto.MyUser" />
<jsp:setProperty property="*" name="user" />

<%
	LoginDao l = new LoginDao();
	boolean status = l.validateUser(user);

	if (status) {
		response.sendRedirect("home.jsp");
	} else {
		response.sendRedirect("index.jsp");
	}
%>