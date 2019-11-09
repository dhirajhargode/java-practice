package p01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import serv.CollBean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		CollBean b = (CollBean)appCntx.getBean("myColl");
		for(String s : b.getMappingResources()) {
			System.out.println(s);
		}
		System.out.println("====================");
		System.out.println(b.getHbmProperties());
		System.out.println("====================");
		System.out.println(b.getJdbcInfo());

	}

}
