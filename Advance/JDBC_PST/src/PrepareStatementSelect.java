import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatementSelect 
{
	public static void main(String[] args) {


		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			
			PreparedStatement pst=con.prepareStatement("select * from employ where job = ? ");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter jb to search");
			String vjob=sc.next();
			
			pst.setString(1, vjob);
			
			
			ResultSet rs=pst.executeQuery();
			
			if(rs.next())
			{
				System.out.println(" E_ID\tE_Name\t E_Job\t E_Sal");
				System.out.println(" ----\t------ \t------ \t--------");
				
				do
				{
					System.out.println(" "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4));
				}
				while(rs.next());
			}
			else
				System.out.println("No data found...");	
				
			
					
			
			sc.close();
			pst.close();
			con.close();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}


	}


}
