package com.sa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/s2")
public class Servlet2 extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try(PrintWriter pw=resp.getWriter()){
			resp.setContentType("text/html");
			
			ServletContext context =getServletContext();
			if(context==null) {
				pw.println("Context object note created");
				req.getRequestDispatcher("index.html").include(req, resp);
				return;
			}
			pw.println("<h2>Form 2<br> Response from Servlet 2");
			pw.println("Sum is "+context.getAttribute("sum")+"<br>");
			pw.println("Sub is "+context.getAttribute("sub")+"<br>");
			pw.println("Prod is "+context.getAttribute("prod")+"<br>");
			
			int x=Integer.parseInt(req.getParameter("t1"));
			int y=Integer.parseInt(req.getParameter("t2"));
			double d=x/y;
			
			context.setAttribute("div", d);
			pw.println("<a href='./s3'>Call Servlet 3</a>");
		}
	}
	

}
