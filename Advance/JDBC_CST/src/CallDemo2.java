import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CallDemo2 {

	public static void main(String[] args) {


		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			CallableStatement cst=con.prepareCall("{call inset_emp(?,?,?,?)}");
		
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter employ Id");
			int vid=sc.nextInt();
			
			System.out.println("Enter employ name");
			String vna=sc.next();
			System.out.println("Enter employ job");
			String vjob=sc.next();
			System.out.println("Enter employ salary");
			double vsal=sc.nextDouble();

			cst.setInt(1, vid);
			cst.setString(2, vna);
			cst.setString(3, vjob);
			cst.setDouble(4, vsal);
			
			cst.execute();
			System.out.println("Data stored ");
			
			
			
			
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