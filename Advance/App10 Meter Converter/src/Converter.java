
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/test")
public class Converter extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");

		double value = Double.parseDouble(req.getParameter("value"));
		String[] type1 = req.getParameterValues("type1");
		String[] type2 = req.getParameterValues("type2");

		for (String t1 : type1) {
			switch (t1) {
			case "mm":
				for (String t2 : type2) {
					switch (t2) {
					case "mm":
						pw.println(value);
						break;

					case "cm":
						pw.println((value / 10));
						break;

					case "inch":
						pw.println(value * 0.0393);
						break;

					case "foot":
						pw.println(value * 0.0032);
						break;

					case "m":
						pw.println(value / 1000);
						break;

					case "km":
						pw.println(value / 100000);
						break;
					case "mile":
						pw.println(value * 0.000000621371192);
						break;
					}
				}
				break;

			case "cm":
				for (String t2 : type2) {
					switch (t2) {
					case "mm":
						pw.println(value * 10);
						break;

					case "cm":
						pw.println((value));
						break;

					case "inch":
						pw.println(value * 0.0393 * 10);
						break;

					case "foot":
						pw.println(value * 0.0032 * 10);
						break;

					case "m":
						pw.println(value / 100);
						break;

					case "km":
						pw.println(value / 10000);
						break;

					case "mile":
						pw.println(value * 0.00000621371192);
						break;
					}
				}
				break;

			case "inch":
				for (String t2 : type2) {
					switch (t2) {
					case "mm":
						pw.println(value * 25.4);
						break;

					case "cm":
						pw.println((value * 25.4 / 10));
						break;

					case "inch":
						pw.println(value);
						break;

					case "foot":
						pw.println(value * 0.08333);
						break;

					case "m":
						pw.println(value * 25.4 / 1000);
						break;

					case "km":
						pw.println(value * 25.4 / 100000);
						break;
					case "mile":
						pw.println(value * 0.0000157828283);
						break;
					}
				}
				break;
			case "foot":
				for (String t2 : type2) {
					switch (t2) {
					case "mm":
						pw.println(value * 304.8);
						break;

					case "cm":
						pw.println((value * 304.8 / 10));
						break;

					case "inch":
						pw.println(value * 12);
						break;

					case "foot":
						pw.println(value);
						break;

					case "m":
						pw.println(value * 304.8 / 1000);
						break;

					case "km":
						pw.println(value * 304.8 / 100000);
						break;
					case "mile":
						pw.println(value * 0.000189393939);
						break;
					}
				}
				break;

			case "m":
				for (String t2 : type2) {
					switch (t2) {
					case "mm":
						pw.println(value * 1000);
						break;

					case "cm":
						pw.println((value * 1000));
						break;

					case "inch":
						pw.println(value * 39.3700787);
						break;

					case "foot":
						pw.println(value * 3.2808399);
						break;

					case "m":
						pw.println(value);
						break;

					case "km":
						pw.println(value / 100);
						break;
					case "mile":
						pw.println(value * 0.000621371192);
						break;
					}
				}
				break;

			case "km":
				for (String t2 : type2) {
					switch (t2) {
					case "mm":
						pw.println(value * 1000000);
						break;

					case "cm":
						pw.println((value * 100000));
						break;

					case "inch":
						pw.println(value * 39370.0787);
						break;

					case "foot":
						pw.println(value * 3280.8399);
						break;

					case "m":
						pw.println(value * 1000);
						break;

					case "km":
						pw.println(value);
						break;
					case "mile":
						pw.println(value * 0.621371192);
						break;
					}
				}
				break;
			case "mile":
				for (String t2 : type2) {
					switch (t2) {
					case "mm":
						pw.println(value * 1609344);
						break;

					case "cm":
						pw.println((value * 1609344 / 10));
						break;

					case "inch":
						pw.println(value * 63360);
						break;

					case "foot":
						pw.println(value * 5280);
						break;

					case "m":
						pw.println(value * 1609.344);
						break;

					case "km":
						pw.println(value * 1.609344);
						break;
					case "mile":
						pw.println(value);
						break;
					}
				}
				break;

			}
		}
	}
}
