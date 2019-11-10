package com.mvc.validation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.validation.model.User;

@Controller
public class RegistrationController {

	@RequestMapping(value = "/registerUser", method = RequestMethod.GET)
	public String viewRegister(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		initializeParameters(model);
		return "register";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute User user, BindingResult result, Model model) {
		initializeParameters(model);
		if (result.hasErrors()) {
			return "register";
		} else {
			model.addAttribute("user", user);
			return "success";
		}
	}

	private void initializeParameters(Model model) {

		List<String> courseList = new ArrayList<String>();
		courseList.add("Core Java");
		courseList.add("Adv Java");
		courseList.add("Oracle");
		courseList.add("Dot Net");
		courseList.add("PHP");
		model.addAttribute("courses", courseList);

		List<String> gendersList = new ArrayList();
		gendersList.add("Male");
		gendersList.add("Female");
		model.addAttribute("genders", gendersList);

		List<String> timingsList = new ArrayList();
		timingsList.add("Morning");
		timingsList.add("Afternoon");
		timingsList.add("Evening");
		model.addAttribute("timings", timingsList);

	}
}
