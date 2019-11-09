import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1")
public class Servlet1 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		
		String s = req.getParameter("name");
		pw.println("<h1>Response from Servlet 1</h1>");
		pw.println("<h1>hi......"+ s+ "</h1>");
		
		
		resp.sendRedirect("./s2");
		//	resp.sendRedirect("https://online-audio-converter.com/");
		
		
	}

}
