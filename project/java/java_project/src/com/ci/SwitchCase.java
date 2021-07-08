package com.ci;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--- 1.Marathi 2.Hindi 3.English 4.Gujrathi ---");
		int number = sc.nextInt();
		
		switch (number) {
		case 1:
			System.out.println("Marathi");
			break;
			
		case 2:
			System.out.println("Hindi");
			break;
			
		case 3:
			System.out.println("English");
			break;
			
		case 4:
			System.out.println("Gujrathi");
			break;

		default:
			System.out.println("wrong number.");
			break;
		}
	}

}
