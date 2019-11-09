package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/voterurl")
public class VoterServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		PrintWriter pw = null;
		String name = null;
		String tage = null;
		int age = 0;

		pw = res.getWriter();
		res.setContentType("text/html");

		name = req.getParameter("name");
		//tage = req.getParameter("age");
		age = Integer.parseInt(req.getParameter("age"));

		if (age >= 18) {
			pw.println("<h1 style='color:green'>" + name + " you are eligible for vote</h1>");
		} else {
			pw.println("<h1 style='color:red'>" + name + " you are not eligible for vote</h1>");
		}

		pw.println("<a href='input.html'><img src='abc.jpg'></a>");
	}

}
