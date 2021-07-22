package com.ci.assignment;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("-- Enter Number --");
	int num = sc.nextInt();
	int i = 1;
	while(i <= 10) {
		System.out.println(num * i);
		i++;
	}
	}
}
