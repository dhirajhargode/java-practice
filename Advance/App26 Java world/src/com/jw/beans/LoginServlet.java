package com.jw.beans;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

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
		String psw = req.getParameter("psw");

		try {
			st = con.createStatement();

			int c = st.executeUpdate(
					"select * from USER_REGISTER where USERNAME ='" + uname + "' and PASSWORD ='" + psw + "'");

			if (c == 1) {
				pw.println("<br><br><br><h1> Welcome to Java World</h1>");
				pw.println("================================");
				pw.println("<h1> you are in Inbox now</h1><br><br><br>");
				pw.println("<a href='login.html'>Log Out</a>");
			} else {
				pw.println("<br><h1> Sorry unable login <br><br> Check ur usename and password </h1>");
				pw.println("<br><br>Retry Again...");
				req.getRequestDispatcher("login.html").include(req, res);
			}

		} catch (SQLException e) {
			//
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
