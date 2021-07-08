package com.ci.assignment;


public class Login {

	public static void main(String[] args) {
		String username = "Admin";
		String password = "Admin@123";
		
		if (username == "Admin"  && password == "Admin@123") {
			System.out.println("Login Successfully");
		} else {
			System.out.println("Login Failed");
		}
	}

}
