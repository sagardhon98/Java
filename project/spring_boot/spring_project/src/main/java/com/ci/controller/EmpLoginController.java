package com.ci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ci.controller.form.EmpLogin;

@Controller
public class EmpLoginController {

	@GetMapping("/empshow")
	public ModelAndView fetchData() {
		ModelAndView mav = new ModelAndView();
		EmpLogin el = new EmpLogin();
		//data
		mav.addObject("el", el);
		//view
		mav.setViewName("emplogin");
		return mav;
	}
	
	@PostMapping("/empsave")
	public ModelAndView showData(EmpLogin el) {
		ModelAndView mav = new ModelAndView();
		//data
		mav.addObject("el", el);
		//view
		mav.setViewName("success");
		System.out.println(el);
		return mav;
	}
}
