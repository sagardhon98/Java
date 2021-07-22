package com.ci.collection_list;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(1L, "A", 16);
		Student s2 = new Student(2L, "B", 21);
		Student s3 = new Student(3L, "C", 26);
		Student s4 = new Student(4L, "D", 18);
		Student s5 = new Student(5L, "E", 17);
		
		List<Student> allStud = new ArrayList<>();
		
		allStud.add(s1);
		allStud.add(s2);
		allStud.add(s3);
		allStud.add(s4);
		allStud.add(s5);
		
		System.out.println(allStud);
		
		List<Student> aboveEighteen = new ArrayList<>();
		List<Student> belowEighteen = new ArrayList<>();
		
		for(Student stud : allStud) {
			if (stud.getAge() > 18) {
				aboveEighteen.add(stud);
			} else {
				belowEighteen.add(stud);
			}
		}
		
		System.out.println("Above 18+  : " + aboveEighteen);
		System.out.println("Below 18+ : " + belowEighteen);
		
	}

}
