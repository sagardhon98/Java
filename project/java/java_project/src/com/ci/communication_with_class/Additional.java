package com.ci.communication_with_class;

public class Additional {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		//Even or Odd
		System.out.println("--- Find number odd or even ---");
		System.out.println("-- Enter Number --");
		int oddEven = cal.oddEven();
		System.out.println(oddEven);
	}

}
