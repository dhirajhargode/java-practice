import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		// create statement object
		Statement st = con.createStatement();

		System.out.println("statement created");
	
		//preparing query
		String query = "create table Employee(ID number(10) primary key,Name varchar2(20),Job varchar2(20), Salary number(9,2))";

		
		//before update check table exist or not in DB
		
		// submit query to DB
		int c = st.executeUpdate(query);
		System.out.println("Table created :" + c);

		st.close();
		con.close();

	}
}
