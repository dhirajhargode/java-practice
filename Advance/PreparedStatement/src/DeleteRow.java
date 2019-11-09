import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRow {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

		String query = "delete employee where id= ?";
		PreparedStatement ps = con.prepareStatement(query);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		ps.setInt(1, id);
		int c=ps.executeUpdate();
		System.out.println("OK");
		
	}
	
}
