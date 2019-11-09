import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchEx1 {
	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			
			Statement st=con.createStatement();
			
			st.addBatch("insert into employ values(33, 'ding', 'ase', 20000)");
			st.addBatch("insert into employ values(34, 'dong', 'tl', 15000)");
			st.addBatch("insert into employ values(35, 'bell', 'pl', 25000)");
			
			st.executeBatch();
			System.out.println("Batch executed sucessfully");
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
