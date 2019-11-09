import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//dynamically create table
public class CreateEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con = null;
		Statement st = null;
		String query = null;
		int c = 0;

		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		st = con.createStatement();

		query = "Create table Products(PCODE NUMBER(10) PRIMARY KEY, PNAME VARCHAR2(20),PRICE NUMBER(7,2))";
		c = st.executeUpdate(query);
		System.out.println("Table created");

		
		st.close();
		con.close();
		

	}

}
