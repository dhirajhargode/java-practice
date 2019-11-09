package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.MyDao;

public class ClientApp {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cfg.xml");
		MyDao d = (MyDao) ctx.getBean("md");
		
		d.add();
		
	}

}

