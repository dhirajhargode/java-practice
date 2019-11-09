package com.dhiraj.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = null, gender = null, address = null, ms = null, qlfy = null, course[] = null, hobbies[] = null;
		int age = 0;

		PrintWriter pw = null;
		// get PrintWriter obj
		pw = res.getWriter();

		// set response content type
		res.setContentType("text/html");

		// read data form
		name = req.getParameter("name");
		age = Integer.parseInt(req.getParameter("age"));
		gender = req.getParameter("gender");
		ms = req.getParameter("ms");
		address = req.getParameter("address");
		qlfy = req.getParameter("qlfy");
		course = req.getParameterValues("course");
		hobbies = req.getParameterValues("hobbies");

		// write processing logic
		if (gender.equalsIgnoreCase("M")) {
			if (age <= 5)
				pw.println("<h1 style='color:red'>master " + name + " u are  baby boy</h1>");
			else if (age <= 11)
				pw.println("<h1 style='color:red'>master " + name + " u are small boy</h1>");
			else if (age <= 18)
				pw.println("<h1 style='color:red'>mr " + name + " u are teenage boy</h1>");
			else if (age <= 35)
				pw.println("<h1 style='color:red'>mr " + name + " u are young man</h1>");
			else if (age <= 50)
				pw.println("<h1 style='color:red'>mr " + name + " u are middle age man</h1>");
			else
				pw.println("<h1 style='color:red'>mr " + name + " u are buddha</h1>");
		} // if
		else if (gender.equalsIgnoreCase("F")) {
			if (age <= 5)
				pw.println("<h1 style='color:red'>master " + name + " u are baby girl</h1>");
			else if (age <= 11)
				pw.println("<h1 style='color:red'>master " + name + " u are small girl</h1>");
			else if (age <= 18)
				if (ms.equalsIgnoreCase("married")) {
					pw.println("<h1 style='color:red'>mrs " + name + " u are teenage girl</h1>");
				} else {
					pw.println("<h1 style='color:red'>miss " + name + " u are teenage girl</h1>");
				}

			else if (age <= 35)
				if (ms.equalsIgnoreCase("married")) {
					pw.println("<h1 style='color:red'>miss " + name + " u are young woman</h1>");
				} else {
					pw.println("<h1 style='color:red'>mrs " + name + " u are young woman</h1>");
				}
			else if (age <= 50)
				if (ms.equalsIgnoreCase("married")) {
					pw.println("<h1 style='color:red'>miss " + name + " u are middle aged woman</h1>");
				} else {
					pw.println("<h1 style='color:red'>mrs " + name + " u are middle aged woman</h1>");
				}
			else if (ms.equalsIgnoreCase("married")) {
				pw.println("<h1 style='color:red'>miss " + name + " u are old woman</h1>");
			} else {
				pw.println("<h1 style='color:red'>mrs " + name + " u are old woman</h1>");
			}
		} // else
		
		//print data

		pw.println("<h1> Name :: " + name +"</h1>");
		pw.println("<h1> age :: " + age +"</h1>");
		pw.println("<h1> Gender :: " + gender +"</h1>");
		pw.println("<h1> Marrital status :: " + ms +"</h1>");
		pw.println("<h1> Address :: " + address +"</h1>");
		pw.println("<h1> Qualification :: " + qlfy +"</h1>");
		pw.println("<h1> Courses :: " + Arrays.toString(course) +"</h1>");
		pw.println("<h1>  Hobbies :: " + Arrays.toString(hobbies) +"</h1>");

	}// doGet

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}// doPost
} // class
