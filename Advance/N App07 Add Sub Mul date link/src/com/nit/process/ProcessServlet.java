package com.nit.process;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = null;
		pw = resp.getWriter();
		resp.setContentType("text/html");

		String value1, value2;
		String comp = null;
		value1 = req.getParameter("value1");
		value2 = req.getParameter("value2");

		comp = req.getParameter("b1");

		if (comp.equals("link1")) {
			pw.println("System Date and Time ::" + new Date());
		} else if (comp.equals("link2")) {
			pw.println("System properties ::" + System.getProperties());
		} else if (comp.equals("Add")) {
			int val1 = Integer.parseInt(value1);
			int val2 = Integer.parseInt(value2);
			pw.println("Addition" + (val1 + val2));

		} else if (comp.equals("Sub")) {

			int val1 = Integer.parseInt(value1);
			int val2 = Integer.parseInt(value2);
			pw.println("Substraction" + (val1 - val2));

		} else if (comp.equals("Mul")) {

			int val1 = Integer.parseInt(value1);
			int val2 = Integer.parseInt(value2);
			pw.println("Multiplication" + (val1 * val2));

		}

	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);

	}

}
