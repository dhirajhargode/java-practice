import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test1")
public class Servlet1 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		String name = req.getParameter("name");
		
		pw.println("Welcome to JAVA LIBRARY .....");
		pw.println("<a href='test2?name="+name+"'>Click here to get user name </a> ");
		
	}
}
