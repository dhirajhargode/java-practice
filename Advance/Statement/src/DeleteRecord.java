import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DeleteRecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		Statement st = con.createStatement();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id to delete record");
		int id = sc.nextInt();

		ResultSet rs = st.executeQuery("select * from employee where id=" + id);

		if (rs != null) {
			while (rs.next()) {
				System.out.println("employee Detail");
				System.out
						.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4));
				
				int c=JOptionPane.showConfirmDialog(null, "Do u want to delete this record");
				if(c==0) {
					st.executeUpdate("delete employee where id="+id);
					JOptionPane.showMessageDialog(null, "Data deletion success");
				}else
					JOptionPane.showMessageDialog(null, "Data not deleted");
			}
		}

	}

}
