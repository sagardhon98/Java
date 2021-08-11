package com.ci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ci.entity.Student;
import com.ci.service.StudentService;

@Controller
public class StudentController {

	@GetMapping("/")
	public String showWelcome() {
		return "/index";
	}

	@GetMapping("/registration")
	public ModelAndView showRegistrationForm() {
		ModelAndView mav = new ModelAndView();
		Student s1 = new Student();
		// data
		mav.addObject("s1", s1);
		// view
		mav.setViewName("/studentRegistration");
		return mav;
	}

	@GetMapping("/savedStudent")
	public String insertStudent(Student s1) {
		studentService.insertStudentData(s1);
		System.out.println(s1);
		return "/success";
	}

	@Autowired
	private StudentService studentService;
}
