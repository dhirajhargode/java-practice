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

public class SignUpServlet extends HttpServlet {

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

		try {
			String fname = req.getParameter("fname");
			String lname = req.getParameter("lname");
			String psw = req.getParameter("psw");
			String cpsw = req.getParameter("repsw");
			String gen = req.getParameter("gen");
			String uname = req.getParameter("uname");
			long mobno = Long.parseLong(req.getParameter("mobno"));
			String dd = req.getParameter("date");
			String mmm = req.getParameter("mon");
			String yyyy = req.getParameter("year");
			String sque = req.getParameter("que");
			String sans = req.getParameter("ans");

			st = con.createStatement();

			if (psw.equals(cpsw)) {
				int c = st.executeUpdate("select * from USER_REGISTER where USERNAME ='" + uname + "'");

				if (c == 0) {
					String q = "insert into USER_REGISTER values ('" + fname + "', '" + lname + "', '" + uname + "', '"
							+ dd + "-" + mmm + "-" + yyyy + "', '" + gen + "', " + mobno + ",'" + psw + "', '" + sque
							+ "', '" + sans + "')";
					st.executeUpdate(q);
					pw.println("<h1> Stored Sucessfully</h1><br>");
					pw.println("<a href='login.html'>Sign In</a>");

				}
			} else {
				pw.println("<h1> Username already exist...</h1>");
				req.getRequestDispatcher("signup.html").include(req, res);

			} // else

		} // try

		catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// doGet

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
