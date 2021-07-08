package com.ci;

public class Employee {
	private int id;
	public void setId(int i) {
		id = i;
	}
	
	private String name;
	public void setName(String n) {
		name = n;
	}
	
	private float salary;
	public void setSalary(float s) {
		salary = s;
	}
	
	//creating a parameterized constructor
	Employee(int i , String n , float s){
		id = i;
		name = n;
		salary = s;
	}
	
	public void show() {
		System.out.println("Employee Id : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Salary : " + salary);
	}
}
