package com.ci;

public class IfElseIf {

	public static void main(String[] args) {
		int mark = 89;
		
		if (mark >= 90 && mark <= 100) {
			System.out.println("Pass with O Grade.");
		}
		else if (mark >= 75 && mark <= 90) {
			System.out.println("Pass with A Grade.");
		}
		else if (mark >= 55 && mark <= 75) {
			System.out.println("Pass with B Grade.");
		}
		else if (mark >= 40 && mark <= 55) {
			System.out.println("Pass with C Grade.");
		}
		else {
			System.out.println("You are failed.");
		}
	}

}
