import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/display")
public class DisplayData  extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw =resp.getWriter();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp1");
			
			while(rs.next()) {
				pw.println(rs.getInt(1));
				pw.println(rs.getString(2));
				pw.println(rs.getString(3));
				pw.println(rs.getDouble(4));
			}//while
		}//try
		catch(Exception e) {
			pw.println(e);
			
		}
	
	}

}
