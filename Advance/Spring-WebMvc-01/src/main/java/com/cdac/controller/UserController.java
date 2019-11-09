package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdac.dao.UserDao;
import com.cdac.dto.User;

@Controller
public class UserController {

	@Autowired
	private UserDao userDao;

	public UserController(UserDao userDao) {

	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@RequestMapping(value = "/user_reg.htm")
	public String createUser(ModelMap model) {
		model.put("user", new User());
		return "user_reg_form";
	}

}
