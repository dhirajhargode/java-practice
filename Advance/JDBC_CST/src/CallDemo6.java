
/*
	create or replace function get_bonus(psal in number) return number is
		bonus number;
	begin
		if psal>=60000 then
		bonus:=psal*0.4;
		elsif psal>=40000 then
		bonus:=psal*0.2;
		else 
		bonus:=psal*0.1;
		end if;
		return bonus;
	end;
	/
	

*/

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallDemo6 {

	public static void main(String[] args) {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

			CallableStatement cst = con.prepareCall("{?=call get_bonus(?)}");

			Scanner sc = new Scanner(System.in);
			System.out.println("enter amt to find out bonus  : ");
			double bns = sc.nextDouble();

			cst.registerOutParameter(1, Types.DOUBLE);
			cst.setDouble(2, bns);
			cst.execute();
			System.out.println("bonus : " + cst.getDouble(1));

			sc.close();
			cst.close();
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}
}
