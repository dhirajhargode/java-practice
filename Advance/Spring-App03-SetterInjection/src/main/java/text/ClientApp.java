package text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.MyServices;

public class ClientApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("cfg.xml");
		MyServices m = (MyServices) ctx.getBean("ms");

		System.out.println(m.getId() + "  " + m.getName());

	}

}
