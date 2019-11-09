package p01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.MyDao;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		MyDao m = (MyDao)appCntx.getBean("md");
		m.add();

	}

}
