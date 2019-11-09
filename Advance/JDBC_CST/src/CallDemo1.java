import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CallDemo1 {

	public static void main(String[] args) {


		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			CallableStatement cst=con.prepareCall("{call natsum(?,?)}");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number to find out natural sum");
			int ns=sc.nextInt();
			
			cst.setInt(1, ns);
			
			cst.registerOutParameter(2, java.sql.Types.INTEGER);
			
			cst.execute();
			System.out.println("sum is "+cst.getInt(2));
			
			
			
					
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
