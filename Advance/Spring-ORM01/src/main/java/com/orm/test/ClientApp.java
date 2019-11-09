package com.orm.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.UserDao;
import com.orm.dto.User;

public class ClientApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("cfg.xml");
		UserDao dao = ctx.getBean(UserDao.class);
		User user = new User(103, "hari", "145");
		//dao.createUser(user);
		//dao.updateUser(user);
		//dao.deletUser(new User(102));
		
		List<User> l = dao.selectList();
		for (User u : l) {
			System.out.println(u);
		}
		
	}

}
