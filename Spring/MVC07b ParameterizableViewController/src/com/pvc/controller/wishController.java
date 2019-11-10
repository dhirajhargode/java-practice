package com.pvc.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class wishController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView();
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		String msg = null;
		if (hour < 12)
			msg = "Good Morning";
		else if (hour < 18)
			msg = "Good Evening";
		else
			msg = "Good evening";
		mav.addObject("msg", msg);
		mav.setViewName("result");
		return mav;

	}

}
