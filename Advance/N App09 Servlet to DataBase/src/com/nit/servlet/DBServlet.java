package com.nit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/db")
public class DBServlet extends HttpServlet {

	Connection con;
	PreparedStatement ps;

	public void init() {
		try {
			// register jdbc driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Establishing the connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

			// create jdbc PreparedStatement object
			ps = con.prepareStatement("select eno,ename,job,salary from emp1 where eno=?");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			PrintWriter pw=resp.getWriter();
			resp.setContentType("text/html");
			
			int eno=Integer.parseInt(req.getParameter("eno"));
			
			//set parameter value to SQL query
			
			ps.setInt(1, eno);
			
			// execute the SQL query
			
			ResultSet rs=ps.executeQuery();
			
			//process the result set
			
			if(rs.next()) {
				pw.println("<br> Employee ID :: "+rs.getInt(1));
				pw.println("<br> Employee Name :: "+rs.getString(2));
				pw.println("<br> Employee Job type :: "+rs.getString(3));
				pw.println("<br> Employee Salary :: "+rs.getFloat(4));
			}
			
			else {
				pw.println("<br> No Employee Found");
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		doGet(req, resp);
	}
	
	@Override
	public void destroy() {

		//close jdbc object
		try {
			if(ps!=null) 
				ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			if(con!=null) 
				con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
