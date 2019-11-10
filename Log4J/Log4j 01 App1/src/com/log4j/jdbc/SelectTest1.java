package com.log4j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

// HTMLLayout and FileAppender
public class SelectTest1 {

	private static final String GET_EMPLOYEE_QUERY = "SELECT EMPNO, NAME, JOB, SALARY FROM EMPLOYEE";
	// create logger object
	private static Logger logger = Logger.getLogger(com.log4j.jdbc.SelectTest1.class);

	static {
		Layout layout = null;
		Appender appender = null;

		// create layout
		layout = new HTMLLayout();
		try {
			// create appender
			appender = new FileAppender(layout, "log.html", true);

		} catch (Exception e) {
			logger.fatal("Log4jApp1.mod1.SelectTest1.static File not found");
		}
		// add appender
		logger.addAppender(appender);

		// specify logger level to retrive log message
		logger.setLevel(Level.ALL);

		logger.debug("Log4jApp1.mod1.SelectTest1.static.Application Started");

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
			logger.warn("Log4jApp1.mod1.SelectTest1.main().jdbc driver register");

			// establish connection
			con = DriverManager.getConnection(url, uname, pwd);
			logger.info("Log4jApp1.mod1.SelectTest1.main().jdbc connection established");

			// create statement
			if (con != null) {
				st = con.createStatement();
				logger.debug("Log4jApp1.mod1.SelectTest1.main().jdbc.Statement created");

			}

			// send and execute query
			if (st != null) {
				rs = st.executeQuery(GET_EMPLOYEE_QUERY);
				logger.debug("Log4jApp1.mod1.SelectTest1.main().ResultSet object created");
			}

			// process the resultset
			if (rs != null) {

				while (rs.next()) {
					flag = true;
					System.out.println(
							rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
					logger.debug("Log4jApp1.mod1.SelectTest1.main().ResultSet Object processed");
				} // while
			} // if
			if (flag == false) {
				System.out.println("Result set object/DB table empty");
				logger.debug("Log4jApp1.mod1.SelectTest1.main().DB table empty" + new Date());
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();
			logger.error("Log4jApp1.mod1.SelectTest1.DB problem :" + sqle.getErrorCode());

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			logger.error("Log4jApp1.mod1.SelectTest1.Driver problem :" + cnfe.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
			logger.fatal("Log4jApp1.mod1.SelectTest1.Unknown problem :" + e.getMessage());

		}

		finally {
			logger.debug("log4jApp1.mod1.SelectTest1.main().finally block");
			try {
				if (rs != null) {
					rs.close();
					logger.debug("log4jApp1.mod1.SelectTest1.main().finally ResultSet object close");

				}
			} catch (SQLException sqle) {
				sqle.printStackTrace();
				logger.error("log4jApp1.mod1.SelectTest1.main().finally ResultSet not closed");
			}
			try {
				if (st != null) {
					st.close();
					logger.debug("log4jApp1.mod1.SelectTest1.main().finally Statement close");

				}
			} catch (SQLException sqle) {
				sqle.printStackTrace();
				logger.error("log4jApp1.mod1.SelectTest1.main().finally Statement not closed");

			}
			try {
				if (con != null) {
					con.close();
					logger.debug("log4jApp1.mod1.SelectTest1.main().finally Connection close");
				}
			} catch (SQLException sqle) {
				sqle.printStackTrace();
				logger.error("log4jApp1.mod1.SelectTest1.main().finally Connection not close");

			}

		} // finally

	}// main

}// class
