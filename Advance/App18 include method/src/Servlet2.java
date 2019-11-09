import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/s2")
public class Servlet2 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req2, HttpServletResponse resp2) throws ServletException, IOException {
	
		PrintWriter pw=resp2.getWriter();
		resp2.setContentType("text/html");
		
		String s=req2.getParameter("tname");
		pw.println("<h1>response from servlet 2<br>");
		pw.println("hi......"+s+"</h1>");
		
		
		
	}

}
