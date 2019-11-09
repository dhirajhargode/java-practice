import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/demo")
public class Servlet2 extends HttpServlet {
	
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();

		pw.println("<h1> page continue refreshing ...<br>");
		Date date=new Date();
		pw.println(date);
		
		resp.setHeader("refresh","1");
		
		}
	}

