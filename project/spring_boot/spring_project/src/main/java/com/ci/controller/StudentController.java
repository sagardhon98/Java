package com.ci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.ci.entity.Student;

@Controller
public class StudentController {

	@GetMapping("/studentform")
	public String saveData(Student student, Model model) {

		// Model model = null;
		model.addAttribute(student);
		return "index";
	}
}