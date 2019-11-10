package com.wapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wapp.service.WishMsgService;

@Controller
public class WelcomeController {

	@Autowired(required = true)
	private WishMsgService service;

	@RequestMapping("/wish.htm")
	public String wishMsg(Model model) {
		model.addAttribute("msg", service.generateWishMsg());
		return "index";
	}

}
