import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test2")
public class Test2 extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		
		pw.println("<h2>Form 2 </h2>");
		pw.println("<h3> Sum is :: "+ req.getAttribute("sum")+"<br>");
		pw.println("sub is:: "+ req.getAttribute("sub")+"<br>");
		pw.println("prod is:: "+ req.getAttribute("prod")+"<br>");
		
		pw.println("</h3><a href=http://localhost:3030/App21_Request_Attribute/test3> Call Sevlet 3</a>");
		
		
	}

}
