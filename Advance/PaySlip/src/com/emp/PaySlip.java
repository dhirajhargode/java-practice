package com.emp;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PaySlip {

	public static void main(String[] args) throws FileNotFoundException {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int empno = 0;
		String query = "select * from emp where id =" + empno;

		double hra, ta, pf, pt, da, sal, gsal, nsal, bsal;
		double comm = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter EMPNO to create payslip :");
		empno = sc.nextInt();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");

			if (con != null)
				st = con.createStatement();

			if (st != null)
				rs = st.executeQuery(query);

			if (rs != null) {
				while (rs.next()) {
					sal = rs.getDouble(6);
					comm = rs.getDouble(7);
					bsal = sal + comm;
					hra = bsal * 0.4;
					ta = bsal * 0.2;
					pf = bsal * 0.12;
					pt = bsal * 0.08;
					da = bsal * 0.3;

					gsal = bsal + hra + ta + da;
					nsal = gsal - pf - pt;

					PrintStream ps = new PrintStream("D:\\Eclipse\\Advance\\JDBC\\PaySlip" + empno + ".dat");
					ps.println("-------------------------------------");
					ps.println("          Payment Slip               ");
					ps.println("-------------------------------------");
					ps.println("         DHIRAJ PVT LMT              ");
					ps.println("            WARDHA                   ");
					ps.println("-------------------------------------");
					ps.println("EMP NO : " + empno);
					ps.println("EMP NAME : " + rs.getString(2));
					ps.println("EMP JOB : " + rs.getString(3));
					ps.println("-------------------------------------");
					ps.println("Basic Pay :: " + bsal);
					ps.println("HRA \t TA \t  DA");
					ps.println(hra + "\t" + ta + "\t" + da);
					ps.println("-------------------------------------");
					ps.println("Gross Sal:: " + gsal);
					ps.println("PF \t PT ");
					ps.println(pf + "\t" + pt);
					ps.println("-------------------------------------");
					ps.println("Net Pay :: " + nsal);
					ps.println("-------------------------------------");

					ps.close();
					System.out.println("Done !!");
				}
			}

		} catch (

		ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}

	}
}
