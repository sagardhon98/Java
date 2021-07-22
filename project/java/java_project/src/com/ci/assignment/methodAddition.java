package com.ci.assignment;

public class methodAddition {

	public static void main(String[] args) {
		int a = getData(3 , 7);
		System.out.println("The Addition of two number is : " + a);
	}
	
	public static int getData(int a , int b) {
		int x = a + b;
		return x;
	}
}
