package p01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll no");
		int r = sc.nextInt();
		System.out.println("Enter name");
		String nm = sc.next();
		System.out.println("Enter marks");
		float m = sc.nextFloat();
		System.out.println("Enter join date[yyyy-mm-dd]");
		String d = sc.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/cdac_db", 
							"root", "cdac");
			Statement s = con.createStatement();
			String q = "insert into student values("+r+",'"+nm+"',"+m+",'"+d+"')";
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
