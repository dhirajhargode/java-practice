package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.MyDao;
import dto.MyTemplate;

public class ClientApp {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("cfg.xml");

		System.out.println("singleton scope");
		MyTemplate mt1 = (MyTemplate) ctx.getBean("mt");
		MyTemplate mt2 = (MyTemplate) ctx.getBean("mt");

		System.out.println("Singleton :: " + mt1.equals(mt2));

		System.out.println("prototype scope");
		MyDao m = (MyDao) ctx.getBean("md");
		MyDao m1 = (MyDao) ctx.getBean("md");

		System.out.println("prototype :: " + m.equals(m1));
	}

}
