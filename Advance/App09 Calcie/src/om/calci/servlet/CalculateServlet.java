package om.calci.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/test")
public class CalculateServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		
		int x= Integer.parseInt(req.getParameter("fn"));
		int y= Integer.parseInt(req.getParameter("sn"));
		
		String c[]=req.getParameterValues("cb");
		try {
		if(c!=null)
		{
			for(String t:c)
			{
				switch(t)
				{
				case "Add" : pw.println("Addition is "+(x+y)+"<br>");
							 break;
				case "Sub" : pw.println("Substraction is "+(x-y)+"<br>");
				 			 break;
				case "Mul" : pw.println("Multiplication is "+x*y+"<br>");
				 			 break;
				case "Div" : pw.println("Division is "+x/y+"<br>");
				 			 break;
				case "Mod" : pw.println("Modulo is "+x%y+"<br>");
				 			 break;
				case "Pow" : pw.println("Power is "+Math.pow(x, y)+"<br>");
							 break;
				
				}

			}
		}else {
			pw.println("Please Perform some operation");
		}
		}catch(NumberFormatException e) {
			pw.println("Please enter only number");
			
		}catch(ArithmeticException e) {
			pw.println("Enter valid number");
		}
		pw.println("<br><a href='index.html'>Home</a>");
	}

}
