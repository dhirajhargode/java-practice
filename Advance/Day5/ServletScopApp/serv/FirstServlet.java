package serv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("reqData", "stored in request");
		
		HttpSession session = request.getSession(true);
        session.setAttribute("sessData", "stored in session");
        
        ServletContext sc = request.getServletContext();
        sc.setAttribute("appData", "stored in context");

//		RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
//		rd.forward(request, response);
		
		response.sendRedirect("SecondServlet");
		
	}

}
