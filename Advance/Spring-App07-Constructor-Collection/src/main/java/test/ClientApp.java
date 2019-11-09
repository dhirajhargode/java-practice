package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dto.MyProperties;

public class ClientApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("cfg.xml");
		MyProperties m = (MyProperties) ctx.getBean("mp");

		System.out.println(m.getList());
		System.out.println(m.getMap());
		System.out.println(m.getProperties());
	}

}
