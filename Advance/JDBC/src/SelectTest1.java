import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest1 {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			
			Statement st=con.createStatement();
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter City");
			String city = sc.next();
			
			
			ResultSet rs=st.executeQuery("select * from Student where S_Add='"+city+"'");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
			}
			
			sc.close();
			rs.close();
			st.close();
			con.close();
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}
		
		
	}

}
