package com.tang.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

@Controller
public class TestNext {
	
	@RequestMapping("test")
	public ModelAndView test(){
		
		ModelAndView mav = new ModelAndView("test");
		
		return mav;
	}
}
