package com.ci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@GetMapping("/show")
	public ModelAndView getData() {
		
		ModelAndView mav = new ModelAndView();
		//data
		mav.addObject("title", "Spring Boot");
		//view
		mav.setViewName("student");
		
		return mav;
	}
}
