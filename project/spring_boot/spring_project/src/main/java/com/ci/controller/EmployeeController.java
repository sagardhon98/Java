package com.ci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/studentName")
	public String getName() {
		String name = "Ram";
		return name;
	}
	
	@GetMapping("/studentplace")
	public String getLocation() {
		String location = "Navi Mumbai";
		return location;
	}
}
