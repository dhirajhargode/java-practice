import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	ServletContext context = null;

	@Override
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		String x=context.getInitParameter("X");
		String y=context.getInitParameter("Y");
		
		pw.println("<h1>Response from servlet 1<br>");
		pw.println("X====>"+x+"<br>");
		pw.println("Y====>"+y+"<br>");

		}
	}

