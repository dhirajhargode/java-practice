import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatementUpdate {

	public static void main(String[] args) {


		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			
			PreparedStatement pst=con.prepareStatement("update employ set sal=sal+? where id=?");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter employ id to update salary");
			int vid=sc.nextInt();
			System.out.println("Enter Increment amount");
			double vsal=sc.nextDouble();
			
			pst.setDouble(1, vsal);
			pst.setInt(2, vid);
			
			int c=pst.executeUpdate();
			System.out.println(c+" row(s) updated");
			
			
			
			
			
			sc.close();
			pst.close();
			con.close();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}


	}

}
