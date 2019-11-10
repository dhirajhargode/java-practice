package com.wapp.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {

	@RequestMapping("/displaydate")
	public String displayDate(Model model) {
		model.addAttribute("msg",new Date());
		return "index";
	}

}
