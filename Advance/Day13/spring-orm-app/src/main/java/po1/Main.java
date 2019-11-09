package po1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.UserDao;
import dto.User;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		UserDao dao = (UserDao)appCntx.getBean(UserDao.class);
//		User user = new User(102, "hari", "567", "ope");
//		dao.createUser(user);
		
		
//		User user = new User(104);
//		dao.deleteUser(user);
		
//		User user = new User(101, "ram", "123", "admin");
//		dao.updateUser(user);
		
		List<User> list = dao.selectUsers();
		for(User u : list) {
			System.out.println(u);
		}
		
		System.out.println("==============");
	}

}
