package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/greet.htm")
	public String greeting(Model model) {
		model.addAttribute("msg", "Good Morning....!");
		return "index";
	}
	
	@RequestMapping("/wish.htm")
	public String wish(Model model) {
		model.addAttribute("msg", "Good Morning....!");
		return "home";
	}
}
