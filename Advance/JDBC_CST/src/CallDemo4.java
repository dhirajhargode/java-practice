/*
	
		create or replace procedure update_emp(pid in int, pinc in int) is
		begin
		update employ set sal=sal+pinc where id=pid;
		end;
		/
		 

*/
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.Scanner;

public class CallDemo4 {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			CallableStatement cst=con.prepareCall("{ call update_emp(?,?)}");

			Scanner sc= new Scanner(System.in);
			
			
			System.out.println("Enter employ id");
			int vid=sc.nextInt();
			System.out.println("enter increameeeeent sal");
			double vsal=sc.nextDouble();
			
			
			
			cst.setInt(1, vid);
			cst.setDouble(2, vsal);

			cst.execute();
			System.out.println("update sucessfully");
			sc.close();
			cst.close();
			con.close();
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}

		
	}
}
