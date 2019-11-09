package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {
	
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		
		ctx = new ClassPathXmlApplicationContext("application-context.xml");
		MyBean b = (MyBean) ctx.getBean("mb");
		System.out.println(b.getMsg());
	}

}
