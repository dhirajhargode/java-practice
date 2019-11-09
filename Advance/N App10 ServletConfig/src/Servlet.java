import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet{

	Connection con;
	PreparedStatement ps;

	public void init() {
		try {
			ServletConfig cg =getServletConfig();
			String driver = cg.getInitParameter("driver");
			String connection = cg.getInitParameter("connection");
			String username = cg.getInitParameter("username");
			String password = cg.getInitParameter("password");

			Class.forName(driver);
			con = DriverManager.getConnection(connection,username,password);

			// jdbcc prepared statement
			ps = con.prepareStatement("select * from emp1 where eno=?");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			PrintWriter pw = resp.getWriter();
			resp.setContentType("text/html");

			int eno = Integer.parseInt(req.getParameter("eid"));

			// set parameter value to SQL query

			ps.setInt(1, eno);

			// execute the SQL query

			ResultSet rs = ps.executeQuery();

			// process the result set

			if (rs.next()) {
				pw.println("<br> Employee ID :: " + rs.getInt(1));
				pw.println("<br> Employee Name :: " + rs.getString(2));
				pw.println("<br> Employee Job type :: " + rs.getString(3));
				pw.println("<br> Employee Salary :: " + rs.getFloat(4));
			}

			else {
				pw.println("<br> No Employee Found");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}

	public void destroy() {

		// close jdbc object
		try {
			if (ps != null)
				ps.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			if (con != null)
				con.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}
}
