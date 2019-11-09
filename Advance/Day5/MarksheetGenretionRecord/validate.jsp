<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/cdac_db","root","cdac");
	PreparedStatement s = con.prepareStatement(
			"select * from my_user where user_name = ? and user_pass = ?");
	s.setString(1, request.getParameter("unm"));
	s.setString(2, request.getParameter("upass"));
	ResultSet rs = s.executeQuery();
	if(rs.next()){
		response.sendRedirect("home.jsp");
	}else{
		response.sendRedirect("login.jsp");
	}
	con.close();
%>