package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

//@WebServlet("/poolurl")
public class PoolConnServlet extends HttpServlet {

	Connection con = null;
	int count =0;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();

		try {
			con=makeConnection();
			Statement st =con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp1");
			
			while(rs.next()) {
				pw.println(rs.getInt(1));
				pw.println(rs.getString(2));
				pw.println(rs.getString(3));
				pw.println(rs.getDouble(4));
				pw.print("<br>");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	private Connection makeConnection() throws Exception {
		
		//locate Jndi registry
		InitialContext ic = new InitialContext();
		
		//Get DataSource obj from jndi
		DataSource ds = (DataSource) ic.lookup("java:/comp/env/DsJndi");
		
		//get JDBC connection from connection pool
		con = ds.getConnection();
		
		return con;
	}

}
