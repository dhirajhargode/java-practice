package p01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.MyDao;
import temp.MyTemplate;

public class Main2 {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg2.xml");
		MyDao dao = (MyDao)appCntx.getBean("dm");
		dao.add();
		
		

	}

}
