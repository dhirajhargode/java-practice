package com.bnuhm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.bnuhm.service.Service;

public class WelcomeController extends AbstractController {

	private Service service;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", service.gernarateMsg());
		mav.setViewName("index");
		return mav;
	}

	public void setService(Service service) {
		this.service = service;
	}

}
