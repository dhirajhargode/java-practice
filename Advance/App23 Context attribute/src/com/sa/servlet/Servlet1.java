package com.sa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/s1")
public class Servlet1 extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try (PrintWriter pw = resp.getWriter()) {
			resp.setContentType("text/html");

			int i = Integer.parseInt(req.getParameter("t1"));
			int j = Integer.parseInt(req.getParameter("t2"));
			int sum=i+j;
			int sub=i-j;
			int prod=i*j;
			
			
			ServletContext context =getServletContext(); 
			
			context.setAttribute("sum", sum);
			context.setAttribute("sub", sub);
			context.setAttribute("prod", prod);
			
			req.getRequestDispatcher("/s2").forward(req, resp);
		}
	}

}
