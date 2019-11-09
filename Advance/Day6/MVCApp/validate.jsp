<%@page import="dao.MyUserDao"%>
<jsp:useBean id="myUser" class="dto.MyUser" ></jsp:useBean>
<jsp:setProperty property="*" name="myUser"></jsp:setProperty>
<% 
	MyUserDao udao = new MyUserDao();
	boolean b = udao.login(myUser);
	if(b){
		response.sendRedirect("home.jsp");
	}else{
		response.sendRedirect("index.jsp");
	}
%>