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
	private UserDao dao;

	public UserController() {

	}

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/user_reg_form.htm")
	public String prepRegForm(ModelMap model) {
		model.put("user", new User());
		return "user_reg_form";
	}

	@RequestMapping("user_reg.htm")
	public String register(User user) {
		dao.createUser(user);
		return "index";
	}

	@RequestMapping(value = "/login_form.htm")
	public String loginForm(ModelMap model) {
		model.put("user", new User());
		return "login_form";
	}

	@RequestMapping(value = "/login.htm")
	public String login(User user, ModelMap model) {
		List<User> list = dao.login(user);
		if (list.isEmpty()) {
			return "login_form";
		} else {
			model.put("role", list.get(0).getUserRole());
			if (list.get(0).getUserRole().equals("admin")) {
				return "admin_home";
			} else if (list.get(0).getUserRole().equals("operator")) {
				return "operator_home";
			}
			return "index";
		}

	}

	@RequestMapping(value = "/user_list.htm")
	public String userList(ModelMap model) {
		List<User> l = dao.selectList();
		model.put("userList", l);
		return "user_list";
	}

	
	
	@RequestMapping(value = "/delete_user.htm")
	public String deleteUser(HttpServletRequest req ,ModelMap model) {
		Integer uid = Integer.parseInt(req.getParameter("userId"));
		User u = new User(uid);
		dao.deleteRecord(u);
		List<User> l = dao.selectList();
		model.put("userList", l);
		return "user_list";
	}

	
	@RequestMapping(value = "/select_user.htm")
	public String selectUser(HttpServletRequest req ,ModelMap model) {
		Integer uid = Integer.parseInt(req.getParameter("userId"));
		User u = dao.fetchRecord(uid);
		model.put("user", u);
		return "update_user_form";
	}
	
	@RequestMapping(value = "/update_user.htm")
	public String updateUser(User user,ModelMap model) {
		dao.updateUser(user);
		List<User> l = dao.selectList();
		model.put("userList", l);
		return "user_list";
	}
	
	
}
