package com.jw.beans;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ForgetPassword extends HttpServlet {

	Connection con;
	Statement st;
	ServletContext context;

	@Override
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();

		try {
			String driver = context.getInitParameter("driver");
			String connection = context.getInitParameter("url");
			String username = context.getInitParameter("uname");
			String password = context.getInitParameter("psw");

			Class.forName(driver);
			con = DriverManager.getConnection(connection, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		String uname = req.getParameter("uname");
		String sque = req.getParameter("que");
		String sans = req.getParameter("ans");

		/*
		 * HttpSession ses=req.getSession(); ses.setAttribute("uname", uname);
		 */
		try {

			st = con.createStatement();

			int c = st.executeUpdate("select * from USER_REGISTER where USERNAME ='" + uname + "' and SEC_QUE='" + sque
					+ "' and SEC_ANS='" + sans + "'");

			if (c == 1) {
				pw.println("<form name='pswchange' action='changepsw' method='post' align='center'>");
				pw.println("<h2 style='align:center;color:blue'>Please Set New Password</h3>");
				pw.println("================================<br>");

				pw.println("<input type='hidden' name='uname' value='" + uname + "'>");

				pw.println("<h2 style='align:center'> New Password : </h2>");
				pw.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
				pw.println(
						"<input type='password' name='psw' placeholder='Enter new password' size='35' required><br>");

				pw.println("<h2 style='align:center'>Conform Password : </h2>");
				pw.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
				pw.println(
						"<input type='password' name='cpsw' placeholder='Conform new password' size='35' required><br>");

				pw.println("<br><br><input type='submit' value='Submit'>");
				pw.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
				pw.println("<a href='login.html'>Cancel</a>");

			} else {
				pw.println("<br><h1> Sorry unable to proceeed...</h1>");
				pw.println("<br>Check your Username, Question and Answer not matched...");
				req.getRequestDispatcher("forgetpsw.html").include(req, res);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		doGet(req, res);
	}

	public void destroy() {

		// close jdbc object
		try {
			if (st != null)
				st.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			if (con != null)
				con.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}

}
