package com.log4j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;

// SimpleLayout and consoleAppender
public class SelectTest {

	private static final String GET_EMPLOYEE_QUERY = "SELECT EMPNO, NAME, JOB, SALARY FROM EMPLOYEE";
	// create logger object
	private static Logger logger = Logger.getLogger(com.log4j.jdbc.SelectTest.class);

	static {
		//use property file based log4j cfgs
		PropertyConfigurator.configure("src/com/log4j/commons/log4j.properties");
		
		logger.debug("Log4jApp1.mod1.SelectTest.static.Application Started");

	}

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String uname = "scott";
		String pwd = "tiger";
		ResultSet rs = null;
		boolean flag = false;

		try {

			// register driver
			Class.forName(driver);
			logger.warn("Log4jApp1.mod1.SelectTest.main().jdbc driver register");

			// establish connection
			con = DriverManager.getConnection(url, uname, pwd);
			logger.info("Log4jApp1.mod1.SelectTest.main().jdbc connection established");

			// create statement
			if (con != null) {
				st = con.createStatement();
				logger.debug("Log4jApp1.mod1.SelectTest.main().jdbc.Statement created");

			}

			// send and execute query
			if (st != null) {
				rs = st.executeQuery(GET_EMPLOYEE_QUERY);
				logger.debug("Log4jApp1.mod1.SelectTest.main().ResultSet object created");
			}

			// process the resultset
			if (rs != null) {

				while (rs.next()) {
					flag = true;
					System.out.println(
							rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
					logger.debug("Log4jApp1.mod1.SelectTest.main().ResultSet Object processed");
				} // while
			} // if
			if (flag == false) {
				System.out.println("Result set object/DB table empty");
				logger.debug("Log4jApp1.mod1.SelectTest.main().DB table empty" + new Date());
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();
			logger.error("Log4jApp1.mod1.SelectTest.DB problem :" + sqle.getErrorCode());

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			logger.error("Log4jApp1.mod1.SelectTest.Driver problem :" + cnfe.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
			logger.fatal("Log4jApp1.mod1.SelectTest.Unknown problem :" + e.getMessage());

		}

		finally {
			logger.debug("log4jApp1.mod1.SelectTest.main().finally block");
			try {
				if (rs != null) {
					rs.close();
					logger.debug("log4jApp1.mod1.SelectTest.main().finally ResultSet object close");

				}
			} catch (SQLException sqle) {
				sqle.printStackTrace();
				logger.error("log4jApp1.mod1.SelectTest.main().finally ResultSet not closed");
			}
			try {
				if (st != null) {
					st.close();
					logger.debug("log4jApp1.mod1.SelectTest.main().finally Statement close");

				}
			} catch (SQLException sqle) {
				sqle.printStackTrace();
				logger.error("log4jApp1.mod1.SelectTest.main().finally Statement not closed");

			}
			try {
				if (con != null) {
					con.close();
					logger.debug("log4jApp1.mod1.SelectTest.main().finally Connection close");
				}
			} catch (SQLException sqle) {
				sqle.printStackTrace();
				logger.error("log4jApp1.mod1.SelectTest.main().finally Connection not close");

			}

		} // finally

	}// main

}// class
