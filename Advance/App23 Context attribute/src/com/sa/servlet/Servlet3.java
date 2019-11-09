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


@WebServlet("/s3")
public class Servlet3 extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try(PrintWriter pw=resp.getWriter()){
			resp.setContentType("text/html");
			
			ServletContext context =getServletContext();
			if(context==null) {
				pw.println("context object note created");
				req.getRequestDispatcher("index.html").include(req, resp);
				return;
			}
			pw.println("<h2>Form 2<br> Response from Servlet 2");
			pw.println("Sum is "+context.getAttribute("sum")+"<br>");
			pw.println("Sub is "+context.getAttribute("sub")+"<br>");
			pw.println("Prod is "+context.getAttribute("prod")+"<br>");
			pw.println("Div is "+context.getAttribute("div")+"<br>");
			


		}
	}
	

}
