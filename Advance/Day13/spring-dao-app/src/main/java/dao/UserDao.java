package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



import dto.User;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public UserDao() {
		super();
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void createUser(User user) {
		String q = "insert into user values("+user.getUserId()+",'"+user.getUserName()+"','"+user.getUserPass()+"','"+user.getUserRole()+"')";
		jdbcTemplate.update(q);
	}
	
	public void deleteUser(User user) {
		String q = "delete from user where user_id = "+user.getUserId();
		jdbcTemplate.update(q);
	}
	
	public void updateUser(User user) {
		String q = "update user set user_name = '"+user.getUserName()+"', user_pass = '"+user.getUserPass()+"', user_role = '"+user.getUserRole()+"' where user_id = "+user.getUserId();
		jdbcTemplate.update(q);
	}
	
	public List<User> selectUsers() {
		String q = "select * from user";
		List<User> list = jdbcTemplate.query(q, new RowMapper<User>() {

			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User u = new User();
				u.setUserId(rs.getInt(1));
				u.setUserName(rs.getString(2));
				u.setUserPass(rs.getString(3));
				u.setUserRole(rs.getString(4));
				return u;
			}
		});
		
		return list;
	}
	
}
