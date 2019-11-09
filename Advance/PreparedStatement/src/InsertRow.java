import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRow {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

		String query = "insert into employee values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id,name,job,salary");
		int id = sc.nextInt();
		String name = sc.next().toUpperCase();
		String job = sc.next().toUpperCase();
		double sal = sc.nextDouble();

		// binding
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, job);
		ps.setDouble(4, sal);

		ps.executeQuery();
		System.out.println("stored sucessfully");

	

	}

}
