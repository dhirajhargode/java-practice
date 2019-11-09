package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Electric
 */
@WebServlet("/Electric")
public class Electric extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<form  action='Electronic' >");
		out.println("<input type='checkbox' name='fan' value='FAN' />FAN<br>");
		out.println("<input type='checkbox' name='cooler' value='COOLER' />COOLER<br>");
		out.println("<input type='submit' value='Next' /><br>");
		out.println("</form>");
		
	}

}
