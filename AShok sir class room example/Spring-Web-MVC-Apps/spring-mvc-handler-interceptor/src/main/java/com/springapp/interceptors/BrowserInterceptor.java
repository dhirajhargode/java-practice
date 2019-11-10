package com.springapp.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class BrowserInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		String browserName = request.getHeader("user-agent");
		System.out.println(browserName);
		if (browserName.contains("Chrome")) {
			response.sendRedirect("error.jsp");
		} else if (browserName.contains("Edge")) {
			response.sendRedirect("error.jsp");
		}
		return true;
	}
}
