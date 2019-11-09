package com.sa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
			
			HttpSession ses=req.getSession(false);
			if(ses==null) {
				pw.println("Session object note created");
				req.getRequestDispatcher("index.html").include(req, resp);
				return;
			}
			pw.println("<h2>Form 2<br> Response from Servlet 2");
			pw.println("ID is "+ses.getId()+"<br>");
			pw.println("Sum is "+ses.getAttribute("sum")+"<br>");
			pw.println("Sub is "+ses.getAttribute("sub")+"<br>");
			pw.println("Prod is "+ses.getAttribute("prod")+"<br>");
			pw.println("Div is "+ses.getAttribute("div")+"<br>");
			


		}
	}
	

}
