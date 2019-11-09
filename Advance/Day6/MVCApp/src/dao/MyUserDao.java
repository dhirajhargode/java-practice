package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conn.MyConn;
import dto.MyUser;

public class MyUserDao {
	private Connection con;
	public boolean login(MyUser myUser) {
		boolean flag = false;
		try {
			con = new MyConn().getMyConn();
			PreparedStatement s = con.prepareStatement(
					"select * from my_user where user_name = ? and user_pass = ?");
			s.setString(1, myUser.getUserName());
			s.setString(2, myUser.getUserPass());
			ResultSet rs = s.executeQuery();
			if(rs.next()) {
				flag = true;
			}
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
}
