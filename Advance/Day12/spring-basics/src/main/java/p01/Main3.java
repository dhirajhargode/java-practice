package p01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.MyDao;
import temp.MyTemplate;

public class Main3 {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg3.xml");
		MyDao m = (MyDao)appCntx.getBean(MyDao.class);
		m.add();
		
		
	}

}
