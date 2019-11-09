
/*
 * 		> create table products(pcode number, pname varchar, price number, descp varchar);
				insert data 
		> create table discount(pcode number, pdis number, foreign key(pcode) references products(pcode));
				insert dis
		> create table transaction(bno number,pcode number,price number, qty number, amt number, dis number, billamt number);
		

*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		int pcode = 0;
		int price = 0;
		int pdis = 0;
		int amt = 0;
		int qty = 0;
		int pqdis = 0;
		int bamt = 0;

		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac_db?useSSL=true", "scott", "tiger");
			
			
			Statement st = con.createStatement();

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter bill no");
			int bn = sc.nextInt();

			System.out.println("Enter product code");
			int vcode = sc.nextInt();

			ResultSet rs1 = st.executeQuery("select pcode, price from products where pcode=" + vcode);
			while (rs1.next()) {

				pcode = rs1.getInt(1);
				price = rs1.getInt(2);
				// System.out.println(price);
			}

			ResultSet rs2 = st.executeQuery("select pcode, pdis from discount where pcode=" + vcode);
			while (rs2.next()) {
				pdis = rs2.getInt(2);
				// System.out.println(pdis);
			}

			System.out.println("enter quantity");
			qty = sc.nextInt();

			amt = price * qty;
			// System.out.println(amt);
			pqdis = qty * pdis;
			bamt = amt - pqdis;
			// System.out.println(bamt);

			int a = st.executeUpdate("insert into transaction values(" + bn + "," + vcode + "," + price + "," + qty
					+ "," + amt + "," + pqdis + "," + bamt + ")");
			System.out.println(a + " row(s) update");

			sc.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e)

		{
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
