package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.MyDao;

public class ClientApp {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("cfg.xml");

		MyDao m = (MyDao) ctx.getBean(MyDao.class);
		m.add();

	}

}
