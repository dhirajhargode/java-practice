import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req1, HttpServletResponse resp1) throws ServletException, IOException {
	
		PrintWriter pw=resp1.getWriter();
		resp1.setContentType("text/html");
		
		String s=req1.getParameter("tname");
		pw.println("<h1>response from servlet 1 <br>");
		pw.println("hello......"+s+"</h1>");
		
		RequestDispatcher rd=req1.getRequestDispatcher("s2");
		rd.forward(req1, resp1);
	}

}
