import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Prepare_statement2 {
	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			
			PreparedStatement pst=con.prepareStatement("delete employ where id=?");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Employ id to delete the record : ");
			int vid = sc.nextInt();
			pst.setInt(1, vid);
			
			int c=pst.executeUpdate();
			System.out.println(c+" Row(s) deleted");
			
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
