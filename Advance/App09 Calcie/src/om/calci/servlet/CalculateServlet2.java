package om.calci.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/demo")
public class CalculateServlet2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");

		int x = Integer.parseInt(req.getParameter("fn"));
		int y = Integer.parseInt(req.getParameter("sn"));

		String c = req.getParameter("sb");
		try {
			switch (c) {
			case "+":
				pw.println("Addition is " + (x + y) + "<br>");
				break;
			case "-":
				pw.println("Substraction is " + (x - y) + "<br>");
				break;
			case "*":
				pw.println("Multiplication is " + x * y + "<br>");
				break;
			case "/":
				pw.println("Division is " + x / y + "<br>");
				break;
			case "%":
				pw.println("Modulo is " + x % y + "<br>");
				break;
			case "Pow":
				pw.println("Power is " + Math.pow(x, y) + "<br>");
				break;

			}

		} catch (NumberFormatException e) {
			pw.println("Please enter only number");

		} catch (ArithmeticException e) {
			pw.println("Division is not Possible");
		}
		pw.println("<br><a href='Calcu.html'>Home</a>");
	}

}
