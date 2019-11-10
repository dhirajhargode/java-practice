package com.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReportGenerator {

	@RequestMapping("/generate")
	public String generateReport(Model model) {
		model.addAttribute("msg", "This page under construction...!");
		return "index";
	}

}
