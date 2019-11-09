/*
	create or replace procedure del_emp(id_c in out int) is
   	begin
    delete employ where id=id_c;
    end;
    /

*/import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallDemo3 {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			CallableStatement cst=con.prepareCall("{ call del_emp(?)}");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter employ id to delete record");
			cst.setInt(1, sc.nextInt());
			cst.registerOutParameter(1,Types.INTEGER);
			cst.execute();
			System.out.println(cst.getInt(1)+" row Deleted");
			
			sc.close();
			cst.close();
			con.close();
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
