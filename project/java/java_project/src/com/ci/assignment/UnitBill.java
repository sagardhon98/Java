package com.ci.assignment;

import java.util.Scanner;

public class UnitBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-- 1.( 0-100 ) 2.( 101-300)  3.( 301-500 ) 4.( 501-1000 ) --");
		System.out.println("-- Enter Unit --");
		
		double unit = sc.nextDouble();
		
		if (unit > 0 && unit <= 100) {
			System.out.println("You will charge per unit 3.44");
		}
		else if (unit > 101 && unit <= 300) {
			System.out.println("You will charge per unit 7.34");
		}
		else if (unit > 301 && unit <= 500) {
			System.out.println("You will charge per unit 10.36");
		}
		else if (unit > 501 && unit <= 1000) {
			System.out.println("You will charge per unit 11.82");
		}
		else {
			System.out.println("You will charge per unit 12.00");
		}
	}
}
