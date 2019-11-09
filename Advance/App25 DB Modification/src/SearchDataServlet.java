import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/SearchData")
public class SearchDataServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charSet=UTF-8");
		PrintWriter pw = resp.getWriter();

		try {
			Integer eid =Integer.parseInt(req.getParameter("eid"));

			HttpSession ses=req.getSession();
			ses.setAttribute("id", eid);

			ServletContext context = getServletContext();
			
			String driver = context.getInitParameter("driver");
			String url = context.getInitParameter("url");
			String user = context.getInitParameter("user");
			String psw = context.getInitParameter("psw");

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from emp1 where eno=" + eid);

			pw.println("<form action ='UpdateData'>");
			pw.println("<h2><u>Employee Data Update Form</u></h2>");
			pw.println("Search Result of Employee " + eid + ".<br>");

			if (rs.next()) {
				pw.println("Employee Name : <input type='text' name='ename' value='" + rs.getString(2) + "'><br>");
				pw.println("Employee Job : <input type='text' name='ejob' value='" + rs.getString(3) + "'><br>");
				pw.println("Employee Salry : <input type='text' name='esalary' value='" + rs.getString(4) + "'><br>");
				pw.println(" <input type='submit' value='Update Data'><br>");
			} else {
				pw.println("No data Found with thid id = " + eid + "<br>");

			}

		} // try
		catch (Exception e) {
			pw.println(e);
			e.printStackTrace();
		}
		pw.println("</form><form action='index.html'><br>");
		pw.println("<input type='submit' value='Cancel'><br>");
		pw.println("</form>");

	}

}
