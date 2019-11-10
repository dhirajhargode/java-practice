package com.swebapps.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.swebapps.service.MsgService;

public class WelcomeController extends AbstractController {

	private MsgService msgService;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView();

		// calling service class method
		mav.addObject("msg", msgService.generateMsg());
		mav.setViewName("index");
		return mav;
	}

	public void setMsgService(MsgService msgService) {
		this.msgService = msgService;
	}

}
