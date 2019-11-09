package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dto.User;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate template;

	public UserDao() {
		System.out.println("UserDao() 0 param constructor");
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void createUser(User user) {

		String q = "insert into user values(" + user.getEmpId() + ",'" + user.getEmpName() + "',"
				+ user.getBasicSalary() + ")";
		template.update(q);

	}

}
