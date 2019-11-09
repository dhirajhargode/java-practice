import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Test1 con=null;
		// add jar file ojdbc6
		Class.forName("oracle.jdbc.driver.OracleDriver"); //thin
		//Class.forName("oracle.jdbc.driver.OCIDriver"); //oci
		
		System.out.println("loading done");
		//protocol:DBname:drivername:@localhost:portno:servicename username password
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		System.out.println("Connection done");
		
		c.close();
		System.out.println("disconnect");

	}
}
