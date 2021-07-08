package com.ci;

public class Student {
	public String fname , lname , email , location;
	
	public void show() {
		System.out.println("Name : " + fname + " " + lname);
		System.out.println("Email : " + email);
		System.out.println("Location : " + location);
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.fname = "Sagar";
		s1.lname = "Dhon";
		s1.email = "sagardhon98@gmail.com";
		s1.location = "Ghansoli";
		
		s1.show();
	}

}
