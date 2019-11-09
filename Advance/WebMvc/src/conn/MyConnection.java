package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/mvc?useSSL=true";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "cdac";

	private Connection con = null;

	public Connection makeConnection() {
		try {
			if (con == null && con.isClosed()) {
				Class.forName(DRIVER);
				con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}
}
