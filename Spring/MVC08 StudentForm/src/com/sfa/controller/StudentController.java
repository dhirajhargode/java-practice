package com.sfa.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sfa.model.Student;

@Controller("/student.htm")
public class StudentController {

	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model) {
		Student s=new Student();
		model.addAttribute("student", s);
		return "studentform";
		
	}
	@RequestMapping(method=RequestMethod.POST)
	public String onSubmit(@ModelAttribute Student s,Model model) {
		
		model.addAttribute("sid", s.getSid());
		model.addAttribute("sname", s.getSname());
		model.addAttribute("semail", s.getSemail());
		model.addAttribute("mobileNum", s.getMobileNum());
		model.addAttribute("courses", Arrays.toString(s.getCourses()));
		
		return "studentdata";
		
	}
}
