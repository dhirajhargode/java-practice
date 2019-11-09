import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/test")
public class Payslip extends GenericServlet {
	

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		PrintWriter pw = resp.getWriter();
		try {
			pw.println("<form>");
			int eid = Integer.parseInt(req.getParameter("eid"));
			String ename = req.getParameter("ename");
			String job = req.getParameter("job");
			Double salary = Double.parseDouble(req.getParameter("salary"));

			String[] all_ded = req.getParameterValues("cb");
			double hra = 0, ta = 0, da = 0, pf = 0, tf = 0, gsal = 0, nsal = 0;
			if(all_ded!=null) {
			for(String ad:all_ded) {
				
				switch(ad) { 
				case "hra":
					hra=salary*0.4;
					break;
				case "ta":
					ta=salary*0.12;
					break;
				case "da":
					da=salary*0.25;
					break;
				case "pf":
					hra=salary*0.15;
					break;
				case "tf":
					tf=salary*0.1;
					break;
				}
			}
			
			}
			gsal = salary + hra + ta + da;
			nsal = gsal - (pf + tf);
			
			pw.println(
					"<table border=1 width=60% align='center'><tr><th colspan='6' align='center'> Employee Payslip</th>");
			pw.println(
					"<tr style='color:blue'><th>ID</th><th>Name</th><th>Job</th><th>Salary</th><th>Gross Salary</th><th>Net Salary</th>");
			pw.println("<tr style='color:red;align:center'><td>" + eid + "</td><td>" + ename + "</td><td>" + job + "</td><td>"
					+ salary + "</td><td>" + gsal + "</td><td>" + nsal + "</td>");
			pw.println("</table></form>");
		} catch (Exception e) {
			pw.println("<a href='index.html'>back</a>");
		}
	}
}
