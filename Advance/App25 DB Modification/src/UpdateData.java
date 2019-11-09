import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/UpdateData")
public class UpdateData extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charSet=UTF-8");
		PrintWriter pw = resp.getWriter();

		try {

			String ename = req.getParameter("ename");
			String ejob = req.getParameter("ejob");
			Float esalary = Float.parseFloat(req.getParameter("esalary"));

			HttpSession ses=req.getSession(false);
			Integer id = (Integer) ses.getAttribute("id");


			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			Statement st = con.createStatement();
		
			st.executeQuery("update emp1 set ename ='" + ename + "', job ='" + ejob + "', salary =" + esalary+" where eno = "+id);
			pw.println("Your data update sucessfully ...!!<br>");
		} catch (Exception e) {
			pw.print(e);
			e.printStackTrace();
		}
	}
}
