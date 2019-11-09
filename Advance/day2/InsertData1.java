package p01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/cdac_db", 
							"root", "cdac");
			Statement s = con.createStatement();
			String q = "insert into student values(103,'hari',99.50,'2018-11-19')";
			int i = s.executeUpdate(q);
			System.out.println(i+" rows inserted");
			con.close();
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
