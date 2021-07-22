package com.ci;

public class StudentDaoTest {

	public static void main(String[] args) {
		StudentDao sd = new StudentDao();
		
		Student s = new Student(2 , "Sham" , "sham@gmail.com" , 15000 , "Thane");
		
		sd.showAll();
	}

}
