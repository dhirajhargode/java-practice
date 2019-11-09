package serv1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		String dc = config.getInitParameter("driver-class");
		String u = config.getInitParameter("url");
		
		ServletContext sc = request.getServletContext();
		String dc1 = sc.getInitParameter("driver-class");
		String u1 = sc.getInitParameter("url");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(dc);
		out.println("<br>");
		out.println(u);
		out.println("<br>");
		out.println(dc1);
		out.println("<br>");
		out.println(u1);
	}

}
