package serv;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String unm = request.getParameter("userName");
		String upass = request.getParameter("userPass");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac_db", "root", "cdac");
			PreparedStatement s = con.prepareStatement("select * from my_user where user_name = ? and user_pass = ?");
			s.setString(1, unm);
			s.setString(2, upass);
			ResultSet rs = s.executeQuery();
			if(rs.next()) {
				response.sendRedirect("HomeServlet");
			}else {
				response.sendRedirect("login.html");
			}
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
