package com.webapps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapps.service.MessageService;

@Controller
public class WelcomeController {

	@Autowired(required = true)
	private MessageService msgService;

	@RequestMapping("/greet.htm")
	public String greeting(Model model) {
		model.addAttribute("msg", msgService.greeting());
		return "index";
	}

	@RequestMapping("/wish.htm")
	public String wish(Model model) {
		model.addAttribute("msg", msgService.wish());
		return "home";
	}
}
