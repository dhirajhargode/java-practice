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
@WebServlet("/Electronic")
public class Electronic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fn = request.getParameter("fan");
		String cr = request.getParameter("cooler");
		HttpSession session = request.getSession(true);
		if(fn!=null) {
			session.setAttribute("fan", fn);
		}
		if(cr!=null) {
			session.setAttribute("cooler", cr);
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<form action='HomeAppliance' >");
		out.println("<input type='checkbox' name='mobile' value='MOBILE' />MOBILE<br>");
		out.println("<input type='checkbox' name='pc' value='PC' />PC<br>");
		out.println("<input type='submit' value='Next' /><br>");
		out.println("</form>");
	}

}
