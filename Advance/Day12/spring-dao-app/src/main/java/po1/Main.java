package po1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.UserDao;
import dto.User;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		UserDao dao = (UserDao)appCntx.getBean(UserDao.class);
		User user = new User(101, "ram", "123", "admin");
		dao.createUser(user);
		
	}

}
