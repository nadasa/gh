package com.wsx.mvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ControllerAdvices {
	@ExceptionHandler(value=Exception.class)
	public ModelAndView exceptionAdvice(Exception exception,WebRequest request){
		ModelAndView model = new ModelAndView("error");
		System.out.println(exception.getMessage());
		model.addObject("errorMsg", "有bug:"+exception.getMessage());
		return model;
	}
	@ModelAttribute
	public void addAttribute(Model model){
		model.addAttribute("addAttribute", "add");
	}
	@InitBinder
	public void initBinddd(WebDataBinder bind){
		bind.setDisallowedFields("id");
	}
	
	
	
}
