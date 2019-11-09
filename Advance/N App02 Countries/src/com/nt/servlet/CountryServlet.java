package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends GenericServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String stateindia[] = { "AP", "MH", "TS", "MP", "UP" };
		String stateus[] = { "CA", "LA", "NY", "CR", "AZ" };
		String stateaus[] = { "TMS", "BB", "CBR" };
		String country = null;

		country = req.getParameter("country");
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		if (country.equals("india")) {
			pw.println("states = " + Arrays.toString(stateindia));
		} else if (country.equals("us")) {
			pw.println("states = " + Arrays.toString(stateus));
		} else {
			pw.println("states = " + Arrays.toString(stateaus));
		}
		pw.close();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);

	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
}