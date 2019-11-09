<%@page import="dao.MarksheetDao"%>
<% 
	int rno = Integer.parseInt(request.getParameter("rno"));
	MarksheetDao mdao = new MarksheetDao();
	int i = mdao.removeMarksheet(rno);
	response.sendRedirect("mark_sheet_list.jsp");
%>