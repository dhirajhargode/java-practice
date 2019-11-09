import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/s1")
public class Servlet1 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		HttpSession ses = req.getSession();

		if (ses.isNew()) {
			pw.println("New Session ID got Created with session ID " + ses.getId());
		} else {
			pw.println("Existing Session only with session ID " + ses.getId());
		}

		String name = req.getParameter("name");
		String value = req.getParameter("value");

		ses.setAttribute(name, value);
		ses.setMaxInactiveInterval(12);
		req.getRequestDispatcher("index.html").include(req, res);

	}

}
