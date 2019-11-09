<%@page import="dao.MarksheetDao"%>
<jsp:useBean id="marksheet" class="dto.Marksheet"  ></jsp:useBean>
<jsp:setProperty property="*" name="marksheet"/>
<%
	MarksheetDao mdao = new MarksheetDao();
	int i = mdao.createMarksheet(marksheet);
	response.sendRedirect("mark_sheet_add_form.jsp");
%>