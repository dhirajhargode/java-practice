package com.nit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DBServlet extends HttpServlet {

	Connection con;
	PreparedStatement ps;
	private static final String Get_Emp_Detail = "select * from emp1 where eno=?";

	public void init() {
		try {
			String driver = null, url = null, uname = null, psw = null;
			// Access by context
			ServletContext context = getServletContext();
			driver = context.getInitParameter("driver");
			url = context.getInitParameter("url");
			uname = context.getInitParameter("uname");
			psw = context.getInitParameter("psw");

			// register jdbc driver
			Class.forName(driver);

			// Establishing the connection
			con = DriverManager.getConnection(url, uname, psw);

			// create jdbc PreparedStatement object
			ps = con.prepareStatement(Get_Emp_Detail);
		} // try
		catch (Exception e) {
			e.printStackTrace();
		} // catch
	}// init()

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		int no = 0;
		RequestDispatcher rd = null, rd1 = null, rd2 = null;

		try {
			// include header content
			rd1 = req.getRequestDispatcher("/headurl");
			rd1.include(req, res);

			pw.println("Before Exception raising...");
			no = Integer.parseInt(req.getParameter("teno"));

			// set value to prepare statement
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				pw.println("<br> Emp No :: " + rs.getInt(1));
				pw.println("<br> Emp Name :: " + rs.getString(2));
				pw.println("<br> Emp Job :: " + rs.getString(3));
				pw.println("<br> Emp Salary :: " + rs.getFloat(4));
			} // if
			else {
				pw.println("<br> <b> Record not Found </b> ");
			} // else

			pw.println("<br><a href='index.html'>Home_Page</a> ");

			rd2 = req.getRequestDispatcher("/footer.html");
			rd2.include(req, res);

		} // try
		catch (Exception e) {
			rd = req.getRequestDispatcher("/erurl");
			rd.forward(req, res);
		} // catch
	}// doGet

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		doGet(req, res);
	}

	public void destroy() {
		// close jdbc object
		try {
			if (ps != null) {
				ps.close();
			}
		} // try
		catch (Exception e) {
			e.printStackTrace();
		} // catch
		try {
			if (con != null) {
				con.close();
			}
		} // try
		catch (Exception e) {
			e.printStackTrace();
		} // catch
	}// destroy
}// class