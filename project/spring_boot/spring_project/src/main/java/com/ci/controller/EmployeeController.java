package com.ci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/location")
	public String getData() {
		String location = "Ghansoli";
		return location;
	}
	
	@GetMapping("/payment")
	public double fetchData() {
		double salary = 45000;
		return salary;
	}
}
