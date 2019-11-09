package com.sla.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import com.sla.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String Student_Insert_Query = "insert into Student_Result values(?,?,?,?,?)";
	private Connection con = null;

	@Override
	public int insert(StudentBO bo) throws Exception {

		con = getPoolConnection();
		PreparedStatement ps = con.prepareStatement(Student_Insert_Query);

		ps.setInt(1, bo.getSno());
		ps.setString(2, bo.getSname());
		ps.setInt(3, bo.getTotal());
		ps.setFloat(4, bo.getAvg());
		ps.setString(5, bo.getResult());

		return ps.executeUpdate();
	}

	private Connection getPoolConnection() throws Exception {

		InitialContext ic = new InitialContext();
		DataSource ds = (DataSource) ic.lookup("java:/comp/env/DsJndi");
		con = ds.getConnection();
		return con;
	}

}
