
/*
	in scott login: 	grant insert on employ to system;
	in system login:	grant insert on student to scott;
		
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchEx3 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			Statement st = con.createStatement();

			// st.addBatch("select * from employ");
			st.addBatch("create table demo(a number(10))");
			st.addBatch("update employ set sal=sal+1000 where id=106");
			st.addBatch("create table books(id number(4), name varchar(15),price number(7,2))");
			st.addBatch("insert into books values(1001,'Core java',400)");
			st.addBatch("insert into system.student values(2,'bhima','corejava')");

			st.executeBatch();
			System.out.println("batch executed sucessfully");

			st.close();
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			e.printStackTrace();

		}
	}
}
