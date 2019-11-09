import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class StAndPst {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac_db","root","cdac");
			
			Statement st=con.createStatement();
			
			long s=System.currentTimeMillis();
			for(int i=1;i<=1000;i++)
			{
				st.executeUpdate("insert into test values("+i+","+i+")");
			}
			
			long e=System.currentTimeMillis();
			System.out.println("Statement time taken : "+(e-s));
			
			PreparedStatement pst=con.prepareStatement("insert into test values(?,?)");
			s=System.currentTimeMillis();
			for(int i=1;i<=1000;i++)
			{
				pst.setInt(1, i);
				pst.setInt(2, i);
				pst.executeUpdate();
			}
			
			e=System.currentTimeMillis();
			System.out.println("Pre-Statement time taken : "+(e-s));
			
			
			st.close();
			pst.close();
			con.close();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}



	}
}
