import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRowEx {

	public static void main(String[] args) {

		try {
			// loading driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

			// create statement
			Statement st = con.createStatement();

			String query = "insert into employee values(1,'Dhiraj','Manager',50000.00)";

			int c = st.executeUpdate(query);
			System.out.println(c + " row inserted");

			st.close();
			con.close();

		} catch (ClassNotFoundException cnfe) {
			System.out.println("Driver not found");

		} catch (SQLException sqle) {
			System.out.println(sqle);
		}

	}
}
