/*
create or replace procedure search_emp(pid in int, pna out varchar, pjob out varchar, psal out number) is
begin
select name, job, sal into pna, pjob, psal from employ where id=pid; 
end;
/

*/

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallDemo5 {

	public static void main(String[] args) {
		try
		{

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			CallableStatement cst=con.prepareCall(" begin search_emp(?,?,?,?);end;");
			
			
			
			System.out.println("Enter emp id to search record");
			
			
			cst.setInt(1, new Scanner(System.in).nextInt());
			cst.registerOutParameter(2,Types.VARCHAR);
			cst.registerOutParameter(3,Types.VARCHAR);
			cst.registerOutParameter(4,Types.VARCHAR);
			
			cst.execute();
			
			System.out.println("Name :"+cst.getString(2));
			System.out.println("Job :"+cst.getString(3));
			System.out.println("Salary :"+cst.getDouble(4));
			
			
			
			cst.close();
			con.close();
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}
	}
}
