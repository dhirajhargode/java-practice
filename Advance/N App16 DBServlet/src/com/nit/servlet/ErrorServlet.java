package com.nit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		RequestDispatcher rd = req.getRequestDispatcher("/headurl");
		rd.include(req, res);

		pw.println("Internal Problem<br><a href='index.html'>Try Again</a>");

		RequestDispatcher rd2 = req.getRequestDispatcher("/footer.html");
		rd2.include(req, res);

	}// doGet

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		doGet(req, res);

	}// doPost

}// class