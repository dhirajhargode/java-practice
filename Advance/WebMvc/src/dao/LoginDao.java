package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conn.MyConnection;
import dto.MyUser;

public class LoginDao {

	private Connection con = null;
	private ResultSet rs = null;

	public boolean validateUser(MyUser user) {
		boolean flag = false;

		try {
			con = new MyConnection().makeConnection();
			PreparedStatement pst = con.prepareStatement("select * from login where username = ? and password = ?");
			pst.setString(1, user.getUsername());
			pst.setString(1, user.getPassword());
			rs = pst.executeQuery();

			while (rs.next()) {
				flag = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return flag;
	}

}
