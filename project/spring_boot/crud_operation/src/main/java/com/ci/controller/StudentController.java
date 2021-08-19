package com.ci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/showAll")
	public ModelAndView showAllStudent() {
		ModelAndView mav = new ModelAndView();
		List<Student> getAllStudent = studentService.getAllStudent();
		//data
		mav.addObject("getAllStudent", getAllStudent);
		//view
		mav.setViewName("/showAllStudent");
		return mav;
	}
	
	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id")Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/showAll";
	}

	@Autowired
	private StudentService studentService;
}
