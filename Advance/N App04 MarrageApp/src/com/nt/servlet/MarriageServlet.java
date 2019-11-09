package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String name = null, gender = null, tage = null, vstatus = null;
		int age = 0;

		PrintWriter pw = null;
		pw = res.getWriter();
		res.setContentType("text/html");

		// read from data
		name = req.getParameter("pname");
		tage = req.getParameter("page");
		gender = req.getParameter("gen");

		// server side validation

		vstatus = req.getParameter("vflag");
		if (vstatus.equals("no")) {

			if (name == null || name.length() == 0 || name.equals("")) {
				pw.println("person name is mandetory");
				return;
			}

			if (tage == null || tage.length() == 0 || tage.equals("")) {
				pw.println("person age is mandetory");
				return;
			} else {
				try {
					age = Integer.parseInt(tage);
				} catch (NumberFormatException nfe) {
					pw.println("Age must be a numeric value");
				}
				if (age <= 0 || age >= 126) {
					pw.println("Age must be in the range of 1 to 125");
				}

			} // else

		}
		
		else {
			age = Integer.parseInt(tage);
		}
		
		
		
		System.out.println("serverside validation is complete");

		/*
		 * //Display error msg if(errList.size()!=0) { for(String errmsg : errList) {
		 * pw.println(errmsg); } }
		 * 
		 */ // request processing logic
		
		if (gender.equalsIgnoreCase("M")) {
			if (age >= 21)
				pw.println("<h1 style='color:red'>Mr. " + name + " u r eligible for marriage , still think twice</h1>");
			else
				pw.print("<h1 style='color:green'>Mr. " + name + " u r not eligible for marriage , enjoy ur life</h1>");
		}
		if (gender.equalsIgnoreCase("F")) {
			if (age >= 18)
				pw.println("<h1 style='color:orange'>Miss. " + name
						+ " u r eligible for marriage , get parents permision</h1>");
			else
				pw.print(
						"<h1 style='color:pink'>Miss. " + name + " u r not eligible for marriage , enjoy on Boys</h1>");
		}

		pw.print("<br><h2 style='color:blue'><a href='input.html'>home</a></h1>");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

}
