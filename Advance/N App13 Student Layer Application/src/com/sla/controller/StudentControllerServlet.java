package com.sla.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sla.dto.StudentDTO;
import com.sla.service.StudentServiceImpl;
import com.sla.vo.StudentVO;

public class StudentControllerServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		String sno = req.getParameter("sno");
		String sname = req.getParameter("sname");
		String m1 = req.getParameter("m1");
		String m2 = req.getParameter("m2");
		String m3 = req.getParameter("m3");

		StudentVO vo = new StudentVO();
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);

		StudentDTO dto = new StudentDTO();
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));

		StudentServiceImpl service = new StudentServiceImpl();
		try {
			String result = service.generateResult(dto);
			pw.println("<h1>Result " + result + "</h1>");

			pw.println("<br><a href='index.html'>Home</a>");
			
		}catch(SQLException se) {
			se.printStackTrace();
		} 
		
		catch (Exception e) {
			pw.println("hello");
			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

	}

}
