import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class Addition extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		
		int x=Integer.parseInt(req.getParameter("tf"));
		int y=Integer.parseInt(req.getParameter("ts"));
		int s=x+y;
		
		
		
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.include(req, resp);
		
		pw.println("<hr><h1>Addition is :: "+s+"</h1>");
	}

}
