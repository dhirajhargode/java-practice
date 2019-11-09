package com.jdbc.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestApp {

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		boolean flag = false;
		String QUERY = "SELECT * FROM EMP WHERE JOB IN('CLERK','MANAGER','SALESMAN') ORDER BY JOB";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

			if (con != null)
				st = con.createStatement();

			if (st != null)
				rs = st.executeQuery(QUERY);

			if (rs != null)
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
							+ " " + rs.getDate(5) + " " + rs.getInt(6) + " " + rs.getInt(7)+ " " + rs.getInt(8));
					flag = true;

				}
			if (!flag)
				System.out.println("record not found");
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
			if (st != null) {
				try {
					st.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException se) {
					se.printStackTrace();

				}

			}
		}

	}

}
