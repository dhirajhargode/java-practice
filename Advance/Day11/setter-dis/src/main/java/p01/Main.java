package p01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import serv.MyService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		MyService m = (MyService)appCntx.getBean("ms");
		System.out.println(m.getServiceId());
		System.out.println(m.getServiceName());

	}

}
