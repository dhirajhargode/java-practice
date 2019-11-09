package com.sm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		try (PrintWriter pw = res.getWriter()) {

			// collecting form 1 info
			String sname = req.getParameter("sname");
			String year = req.getParameter("year");

			// create form 2
			pw.println("<form action='servlet2'>");
			pw.println("mail ID :: <input type='text' name='mailId'><br>");
			pw.println("Phone No :: <input type='text' name='phoneNo'><br>");
			pw.println("Qualification :: <input type='text' name='Qualification'><br>");

			// add hidden value
			pw.println("<input type='hidden' name='sname' value=" + sname + ">");
			pw.println("<input type='hidden' name='year' value=" + year + ">");
			pw.println("<input type='submit' value='submit'>");
			pw.println("</form>");
		}
	}
}
