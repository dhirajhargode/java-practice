import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class Demo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		
		PrintWriter pw=resp.getWriter();
		
		int first=Integer.parseInt(req.getParameter("tfirst"));
		int second=Integer.parseInt(req.getParameter("tsecond"));
		pw.println("<h1> Addition  is :: "+(first+second)+"</h1>");

	}

}
