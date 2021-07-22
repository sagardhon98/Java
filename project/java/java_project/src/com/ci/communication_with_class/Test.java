package com.ci.communication_with_class;

public class Test {

	public static void main(String[] args) {
		Calculator cal = new Calculator(); //creating object of Calculator
		
		//Addition
		System.out.println("--- Addition ---");
		int add = cal.addition(2 , 8);
		System.out.println("The addition of two number is : " + add);
		
		//Substraction
		System.out.println("--- Substraction ---");
		int sub = cal.substraction(4 , 2);
		System.out.println("The substraction of two number is : " + sub);
		
		//Division
		System.out.println("--- Division ---");
		int div = cal.division(10 , 2);
		System.out.println("The division of two number is : " + div);
		
		//Multiplication
		System.out.println("--- Multiplication ---");
		int mul = cal.multiplication(3 , 6);
		System.out.println("The multiplication of two number is : " + mul);
		
		//Product
		System.out.println("--- Product ---");
		int pro = cal.product(2);
		System.out.println("The product is : " + pro);
		
		//Leap Year
		System.out.println("--- Find Leap Year ---");
		System.out.println("-- Enter Year --");
		int leap = cal.leadYear();
		System.out.println(leap);
		
		
	}
}
