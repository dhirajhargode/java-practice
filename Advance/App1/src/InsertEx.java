import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//dynamically update table
public class InsertEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con = null;
		Statement st = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		st = con.createStatement();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID,Name,Job and Salary details");

		int id = sc.nextInt();
		String name = sc.next();
		String job = sc.next();
		double sal = sc.nextDouble();

		String query = "insert into employee values(" + id + ",'" + name + "','" + job + "'," + sal + ")";

		int c = st.executeUpdate(query);
		if (c == 1) {
			System.out.println("Data stored sucessfully...");
		} else {
			System.out.println("Data not found");
		}

		
		st.close();
		con.close();
	}

}
