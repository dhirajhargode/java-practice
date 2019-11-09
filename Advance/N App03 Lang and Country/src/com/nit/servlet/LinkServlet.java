package com.nit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter pw = null;
		String link = null;
		Locale locales[] = null;

		pw = res.getWriter();
		res.setContentType("text/html");

		link = req.getParameter("s1");
		System.out.println(link);
		if (link.equalsIgnoreCase("link1")) {
			locales = Locale.getAvailableLocales();
			for (Locale lc : locales) {
				pw.println(lc.getDisplayLanguage() + "<br>");
			}
		} else if (link.equalsIgnoreCase("link2")) {
			locales = Locale.getAvailableLocales();
			for (Locale lc : locales) {
				pw.println(lc.getDisplayCountry() + "<br>");
			}
		} else {
			pw.println("Date and  Time " + new Date());
		}
		pw.println("<a href='index.html'>Home</a>");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}
