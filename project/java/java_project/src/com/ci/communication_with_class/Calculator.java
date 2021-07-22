package com.ci.communication_with_class;

import java.util.Scanner;

public class Calculator {
	
	//Addition
	public int addition(int a , int b) {
		return a + b;
	}
	
	//Substraction
	public int substraction(int a , int b) {
		return a - b;
	}
	
	//Division
	public int division(int a , int b) {
		return a / b;
	}
	
	//Multiplication
	public int multiplication(int a , int b) {
		return a * b;
	}
	
	//Product
	public int product(int a) {
		return a * a;
	}
	
	//Find leap year
	public int leadYear() {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
			System.out.println("This year is leap.");
		} else {
			System.out.println("This year is not leap.");
		}
		return year;
	}
	
	
	//Number is even or odd
	public int oddEven() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("This number is Even");
		} else {
			System.out.println("This number is Odd");
		}
		return a;
	}
	
	
	
	
	
}
