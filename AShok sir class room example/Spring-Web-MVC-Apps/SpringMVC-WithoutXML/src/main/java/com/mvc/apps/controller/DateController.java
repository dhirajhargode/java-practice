package com.mvc.apps.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {

	@RequestMapping("/displayDate")
	public String display(Model model) {
		model.addAttribute("msg", new Date());
		return "index";
	}
}
