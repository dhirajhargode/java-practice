package com.sa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
			
			
			HttpSession ses=req.getSession();
			
			ses.setAttribute("sum", sum);
			ses.setAttribute("sub", sub);
			ses.setAttribute("prod", prod);
			
			req.getRequestDispatcher("/s2").forward(req, resp);
		}
	}

}
