import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/App2")
public class GenericServletImp extends GenericServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init(ServletConfig config) method");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service(SReq, SRes) method");
		
	}

	@Override
	public void destroy() {
		System.out.println("destroy() method");
		
	}
	
	
}
