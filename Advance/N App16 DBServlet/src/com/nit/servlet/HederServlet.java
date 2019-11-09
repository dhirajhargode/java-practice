package com.nit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HederServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		// header content
		pw.println("<h1><center> H C L Technologies</center></h1> ");

	}// doGet

}// class