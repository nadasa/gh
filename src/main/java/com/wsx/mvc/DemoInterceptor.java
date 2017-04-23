package com.wsx.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DemoInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		long t = System.currentTimeMillis();
		System.out.println("preHandle:"+t);
		request.setAttribute("start", t);
		return true;
	}
	
	/**
	 * This implementation is empty.
	 */
	@Override
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		long t = (long) request.getAttribute("start");
		long tt = System.currentTimeMillis()-t;
		request.removeAttribute("start");
		System.out.println("among:"+tt);
		request.setAttribute("among", tt);
		
	}
}
