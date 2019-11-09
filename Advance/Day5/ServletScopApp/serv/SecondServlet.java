package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String rq = (String)request.getAttribute("reqData");
		
		HttpSession session = request.getSession(true);
        String s = (String)session.getAttribute("sessData");
		
        ServletContext sc = request.getServletContext();
        String a = (String)sc.getAttribute("appData");
        
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Req   "+rq);
		out.println("Ses   "+s);
		out.println("Contx   "+a);
		out.flush();
		out.close();
	}

}
