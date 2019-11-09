package p01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.MyDao;
import temp.MyTemplate;

public class Main1 {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg1.xml");
		MyTemplate m = (MyTemplate)appCntx.getBean("tm");
		MyTemplate m1 = (MyTemplate)appCntx.getBean("tm");
		

	}

}
