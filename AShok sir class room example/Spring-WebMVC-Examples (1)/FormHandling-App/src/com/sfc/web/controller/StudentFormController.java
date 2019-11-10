package com.sfc.web.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sfc.web.model.Student;

@Controller(value = "/student.htm")
public class StudentFormController {

	@RequestMapping(method = RequestMethod.GET)
	public String initForm(Model model) {
		model.addAttribute("student", new Student());
		return "index";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute Student s, ModelMap model, BindingResult result) {
		if (result.hasErrors()) {
			return "index";
		}
		model.addAttribute("sid", s.getSid());
		model.addAttribute("sname", s.getSname());
		model.addAttribute("semail", s.getSemail());
		model.addAttribute("mobileNum", s.getMobileNum());
		model.addAttribute("courses", Arrays.toString(s.getCourses()));
		return "success";
	}

}
