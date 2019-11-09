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

public class ChangePassword extends HttpServlet {

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

		/*
		 * HttpSession ses = req.getSession(false); if (ses == null) {
		 * pw.println("Session object note created");
		 * req.getRequestDispatcher("index.html").include(red, res); return; }
		 */
		String psw = req.getParameter("psw");
		String cpsw = req.getParameter("cpsw");
		String uname = req.getParameter("uname");

		if (psw.equals(cpsw)) {
			try {
				st = con.createStatement();

				int c = st.executeUpdate(
						"update USER_REGISTER set PASSWORD = '" + psw + "' where USERNAME ='" + uname + "'");
				if (c == 1) {
					pw.println("<h3 style='align:center;color:green'>Your password changed Sucessfully....<br>");
					req.getRequestDispatcher("login.html").include(req, res);
				} else {
					pw.println("<h3 style='align:center;color:red'>Your password not changed Sucessfully....<br>");
					req.getRequestDispatcher("login.html").include(req, res);

				}
			} catch (SQLException e) {
				pw.println("hello");
				e.printStackTrace();
			}

		} else {

			pw.println("<h1> Password not matched.....</h1>");
			req.getRequestDispatcher("forgetpsw.html").include(req, res);

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
