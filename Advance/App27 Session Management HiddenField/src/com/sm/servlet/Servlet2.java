package com.sm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		try (PrintWriter pw = res.getWriter()) {
			// collect form 2 data
			String sname = req.getParameter("sname");
			String year = req.getParameter("year");
			String phoneNo = req.getParameter("phoneNo");
			String mailId = req.getParameter("mailId");
			String Qualification = req.getParameter("Qualification");

			// create new form display all data

			pw.println("<html>");
			pw.println("Registration Done !!<br>");
			pw.println("Student name ::" + sname + "<br>");
			pw.println("Year ::" + year + "<br>");
			pw.println("Phone No ::" + phoneNo + "<br>");
			pw.println("Mail Id ::" + mailId + "<br>");
			pw.println("Qualification ::" + Qualification + "<br>");
			pw.println("</html>");

		}
	}

}
