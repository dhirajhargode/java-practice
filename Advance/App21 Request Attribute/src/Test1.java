import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test1")
public class Test1 extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		
		int x= Integer.parseInt(req.getParameter("t1"));
		int y= Integer.parseInt(req.getParameter("t2"));
		
		int sum=x+y;
		int sub=x-y;
		int prod=x*y;
		
		req.setAttribute("sum", sum);
		req.setAttribute("sub", sub);
		req.setAttribute("prod", prod);
		
		req.getRequestDispatcher("/test2").forward(req, resp);
		
				
		
		
	}

}
