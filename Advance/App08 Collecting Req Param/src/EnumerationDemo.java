import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test")
public class EnumerationDemo extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		PrintWriter pw = resp.getWriter();

		Enumeration<String> e = req.getParameterNames();
		while (e.hasMoreElements()) {
			String p = (String) e.nextElement();
			String v = req.getParameter(p);
			pw.println("<h1>"+p + ".........." + v+"<br><br></h1>");
		}

	}
}
