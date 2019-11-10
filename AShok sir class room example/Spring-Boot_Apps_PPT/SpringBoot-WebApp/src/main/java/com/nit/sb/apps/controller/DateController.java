package com.nit.sb.apps.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {

	@RequestMapping("/date")
	public String displayDate(Model model) {
		// adding msg to model
		model.addAttribute("msg", new Date());
		// returning view name
		return "dateDisplay";
	}
}
