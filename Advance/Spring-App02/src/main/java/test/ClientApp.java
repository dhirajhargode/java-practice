package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.MyCollection;

public class ClientApp {

	private static ApplicationContext ctx;

	public static void main(String[] args) {

		ctx = new ClassPathXmlApplicationContext("cfg.xml");
		MyCollection m = (MyCollection) ctx.getBean("mc");

		System.out.println(m.getNo());
		System.out.println("==================");
		System.out.println(m.getName());
		System.out.println("==================");
		System.out.println(m.getList());
		System.out.println("==================");
		System.out.println(m.getMap());
		System.out.println("==================");
		System.out.println(m.getProp());
		System.out.println("==================");

	}

}
