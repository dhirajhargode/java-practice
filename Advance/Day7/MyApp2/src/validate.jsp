<%@page import="dao.MyUserDao"%>
<jsp:useBean id="myUser" class="dto.MyUser" scope="session"  ></jsp:useBean>
<jsp:setProperty property="*" name="myUser"></jsp:setProperty>
<% 
	MyUserDao udao = new MyUserDao();
	boolean b = udao.login(myUser);
	if(b){
		response.sendRedirect("home.jsp");
	}else{
		Cookie cookie = new Cookie("uname",myUser.getUserName());
		cookie.setMaxAge(60*60*24);
		response.addCookie(cookie);
		response.sendRedirect("index.jsp");
	}
%>