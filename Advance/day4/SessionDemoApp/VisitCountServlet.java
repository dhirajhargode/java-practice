package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/VisitCountServlet")
public class VisitCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(true);
		Integer count = (Integer)session.getAttribute("counter");
		if(count==null) {
			Integer i = new Integer(1);
			session.setAttribute("counter", i);
			out.println("u r visting first time");
		}else {
			count++;
			session.setAttribute("counter", count);
			out.println("u r visting "+count+" time");
			if(count==10) {
				session.removeAttribute("counter");
				session.invalidate();
			}
		}
		out.flush();
		out.close();
	}

}
