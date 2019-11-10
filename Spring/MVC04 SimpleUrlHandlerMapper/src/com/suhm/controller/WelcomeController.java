package com.suhm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.suhm.service.MgsService;

public class WelcomeController extends AbstractController {

	private MgsService service;

	public void setService(MgsService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Msg from simple Url Handler Mapper from controller");
		mav.setViewName("index");
		return mav;
	}

}
