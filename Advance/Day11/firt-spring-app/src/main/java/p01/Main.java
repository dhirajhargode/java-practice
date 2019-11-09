package p01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import serv.MyBean;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		MyBean m = (MyBean)appCntx.getBean("mb");
		System.out.println(m.getMsg());
		

	}

}
