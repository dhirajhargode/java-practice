import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test")
public class Servlet1 extends HttpServlet {
	
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		
		pw.println("<h1>please wait 5 sec page refreshing ...<br>");
		pw.println(new java.util.Random().nextInt());
		
		String s="demo";
		resp.setHeader("refresh", "5");
		
		}
	}

