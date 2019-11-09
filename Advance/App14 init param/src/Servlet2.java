import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		PrintWriter pw = resp.getWriter();
		
		ServletConfig cg=getServletConfig();
		
		String a=cg.getInitParameter("A");
		String b=cg.getInitParameter("B");
		
		pw.println("<h1>Response from servlet 2<br>");
		pw.println("A====>"+a+"<br>");
		pw.println("B====>"+b+"<br>");

		}
	}

