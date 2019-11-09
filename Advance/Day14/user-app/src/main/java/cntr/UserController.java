package cntr;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.UserDao;
import dto.User;

@Controller
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@RequestMapping(value="/reg_form.htm")
	public String prepRegForm(ModelMap model) {
		model.put("user", new User());
		return "reg_form";
	}

	@RequestMapping(value="/reg.htm")
	public String register(User user) {
		userDao.createUser(user);
		return "index";
	}
	
	@RequestMapping(value="/login_form.htm")
	public String prepLoginForm(ModelMap model) {
		model.put("user", new User());
		return "login_form";
	}
	
	@RequestMapping(value="/login.htm")
	public String login(User user,ModelMap model) {
		
		List<User> list = userDao.login(user);
		if(list.isEmpty()) {
			model.put("user", new User());
			return "login_form";
		}else {
			model.put("role", list.get(0).getUserRole());	
			if(list.get(0).getUserRole().equals("admin")) {
				return "admin_home";
			}else if(list.get(0).getUserRole().equals("operator")) {
				return "operator_home";
			}
		}
		return "index";
	}
	
	@RequestMapping(value="/user_list.htm")
	public String userList(ModelMap model) {
		List<User> l = userDao.selectUsers();
		model.put("ulist", l);
		return "user_list";
	}
	
	@RequestMapping(value="/delete_user.htm")
	public String deleteUser(HttpServletRequest request,ModelMap model) {
		String uid = request.getParameter("userId");
		int userId = Integer.parseInt(uid);
		User u = new User(userId);
		userDao.deleteUser(u);
		List<User> l = userDao.selectUsers();
		model.put("ulist", l);
		return "user_list";
	}
	
	@RequestMapping(value="/select_user.htm")
	public String selectUser(HttpServletRequest request,ModelMap model) {
		String uid = request.getParameter("userId");
		int userId = Integer.parseInt(uid);
		User u = userDao.selectUser(userId);
		model.put("user", u);
		return "update_user_form";
	}
	
	@RequestMapping(value="/update_user.htm")
	public String updateUser(User user,ModelMap model) {
		userDao.updateUser(user);
		List<User> l = userDao.selectUsers();
		model.put("ulist", l);
		return "user_list";
	}
	
}
