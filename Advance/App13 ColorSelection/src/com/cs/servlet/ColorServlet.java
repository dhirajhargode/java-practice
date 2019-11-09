package com.cs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/test")
public class ColorServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		String c[] = req.getParameterValues("cb");

		if (c != null) {
			for (String t : c) {
				pw.println("<font color='" + t + "'>" + t + "</font>");
			}
		} else {
			pw.println("No color Seleted");
		}

	}

}
