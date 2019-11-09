package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.UserDao;
import dto.User;

public class ClientApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("cfg.xml");
		UserDao dao = ctx.getBean(UserDao.class);
		dao.createUser(new User(101, "Dhiraj", 203020.00d));
		((AbstractApplicationContext) ctx).close();
	}

}
