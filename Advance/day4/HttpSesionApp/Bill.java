package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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
@WebServlet("/Bill")
public class Bill extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<String> items = new ArrayList<>();
		HttpSession session = request.getSession(false);
		
		String f = (String)session.getAttribute("fan");
		if(f!=null) {
			items.add(f);
		}
		String c = (String)session.getAttribute("cooler");
		if(c!=null) {
			items.add(c);
		}
		String p = (String)session.getAttribute("pc");
		if(p!=null) {
			items.add(p);
		}
		String m = (String)session.getAttribute("mobile");
		if(m!=null) {
			items.add(m);
		}
		
		
		String ir = request.getParameter("iron");
		String co = request.getParameter("cooker");
		if(ir!=null) {
			items.add(ir);
		}
		if(co!=null) {
			items.add(co);
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Selected Items");
		for(String s : items) {
			out.println("<h1>"+s+"</h1>");
		}
	}

}
