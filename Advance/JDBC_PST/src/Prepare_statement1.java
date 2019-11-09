import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class Prepare_statement1 {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			
			PreparedStatement pst=con.prepareStatement("insert into employ values(?,?,?,?)");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Employ ID");
			int vid=sc.nextInt();
			System.out.println("Enter Employ Name");
			String vna=sc.next();
			System.out.println("Enter Employ Job");
			String vjob=sc.next();
			System.out.println("Enter Employ Salary");
			double vsal=sc.nextDouble();
			
			
			pst.setInt(1, vid);
			pst.setString(2, vna);
			pst.setString(3, vjob);
			pst.setDouble(4, vsal);
			
			pst.executeQuery();
			System.out.println("Data stored");
			
			sc.close();
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}
	}

}
