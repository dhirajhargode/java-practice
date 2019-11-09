import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/App1")
public class ServletInterfaceDemo implements Servlet{
	
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
	
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("ServletConfig getServletConfig() method");
		return null;
	}
	
	@Override
	public String getServletInfo() {
		System.out.println("developed by Dhiraj");
		return null;
	}
}
