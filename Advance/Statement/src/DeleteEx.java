import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteEx {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee Id to delete record :");
		int id = sc.nextInt();

		String query = "delete employee where id=" + id;
		int c = st.executeUpdate(query);
		if (c == 1) {
			System.out.println(c+" row Deleted sucessfully");
		} else {
			System.out.println("Id not found");
		}
		
		st.close();
		con.close();
	}
}
