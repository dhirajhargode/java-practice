import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/test2")
public class Servlet2 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		HttpSession ses = req.getSession(false);
		if (ses == null) {
			pw.println("No session information is available...");
		} else {
			Enumeration e = ses.getAttributeNames();
			while (e.hasMoreElements()) {
				String name = (String) e.nextElement();
				String value = (String) ses.getAttribute(name);
				
				pw.println(name + " :: " + value);
				pw.println("<br>..........");
			}

			long l1 = ses.getCreationTime();
			long l2 = ses.getMaxInactiveInterval();
			long l3 = ses.getLastAccessedTime();

			pw.println("The creation time is :: " + new Date(l1) + "<br>");
			pw.println("The inactive interval time is :: " + new Date(l2) + "<br>");
			pw.println("The last accessed time is :: " + new Date(l3) + "<br>");

		}

	}
}
