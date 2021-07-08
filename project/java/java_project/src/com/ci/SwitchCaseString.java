package com.ci;

import java.util.Scanner;

public class SwitchCaseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---- a.Apple b.Banana m.Mango o.Orange ----");
		String fruits = sc.next();
		
		switch (fruits) {
		case "a":
			System.out.println("Apple");
			break;
			
		case "b":
			System.out.println("Banana");
			break;
			
		case "m":
			System.out.println("Mango");
			break;
			
		case "o":
			System.out.println("Orange");
			break;

		default:
			System.out.println("Not available");
			break;
		}
	}
}
