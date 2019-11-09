package com.slc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet("/demo")
public class LifeCycle implements Servlet {

	static {
		System.out.println("servlet loading ");
	}

	public LifeCycle() {
		System.out.println("servlet instatiating ");
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init() method executing ");
		init();

	}

	private void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		ServletConfig cg=getServletConfig();
		resp.setContentType("text/html");
		System.out.println("service() method execution ");
		PrintWriter pw = resp.getWriter();
		pw.println("<h1>Welcome to advance java</h1>");
		pw.print("<h1>The server time is :: " + new Date() + "</h1>");

		
	}

	@Override
	public void destroy() {
		System.out.println("destroy() method execution ");

	}

	@Override
	public ServletConfig getServletConfig() {

		return null;
	}

	@Override
	public String getServletInfo() {

		return "devloped by Dhiraj";
	}

}
