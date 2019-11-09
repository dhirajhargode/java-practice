package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/htmltojsurl")
public class HTMLServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int cc = 0;
	
		String[] capital = { "New Delhi", "Islamabad", "Katmandu" };

		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		cc = Integer.parseInt(req.getParameter("country"));

		pw.println(capital[cc]);

		pw.close();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}
}
