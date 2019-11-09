import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectQueryEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		Statement st = con.createStatement();

		System.out.print("Enter employee Id to search employee :");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		
		String query = "select * from employee where id =" + id;
		
		int c = st.executeUpdate(query);
		
		if (c == 0) {
			System.out.println("No data found with given Id  ");
		} else {
			System.out.println("Data Found");
		}

		st.close();
		con.close();

	}

}
