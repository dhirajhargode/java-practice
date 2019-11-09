package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Electronic
 */
@WebServlet("/HomeAppliance")
public class HomeAppliance extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pc = request.getParameter("pc");
		String mb = request.getParameter("mobile");
		HttpSession session = request.getSession(false);
		if(pc!=null) {
			session.setAttribute("pc", pc);
		}
		if(mb!=null) {
			session.setAttribute("mobile", mb);
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<form action='Bill' >");
		out.println("<input type='checkbox' name='iron' value='IRON' />IRON<br>");
		out.println("<input type='checkbox' name='cooker' value='COOKER' />COOKER<br>");
		out.println("<input type='submit' value='Bill' /><br>");
		out.println("</form>");
	}

}
