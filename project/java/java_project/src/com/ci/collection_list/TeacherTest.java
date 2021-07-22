package com.ci.collection_list;

import java.util.ArrayList;
import java.util.List;

public class TeacherTest {

	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher(1L, "a", 14000);
		Teacher teacher2 = new Teacher(2L, "b", 16000);
		Teacher teacher3 = new Teacher(3L, "c", 21000);
		Teacher teacher4 = new Teacher(4L, "d", 22000);
		Teacher teacher5 = new Teacher(5L, "e", 10000);
		
		List<Teacher> allTeacher = new ArrayList<>();
		
		allTeacher.add(teacher1);
		allTeacher.add(teacher2);
		allTeacher.add(teacher3);
		allTeacher.add(teacher4);
		allTeacher.add(teacher5);
		
		System.out.println(allTeacher);
		
		List<Teacher> more = new ArrayList<>();
		List<Teacher> less = new ArrayList<>();
		
		for(Teacher x : allTeacher) {
			if (x.getSalary() > 18000) {
				more.add(x);
			} else {
				less.add(x);
			}
		}
		System.out.println("More than 18000 : " + more);
		System.out.println("Less than 18000 : " + less);
	}

}
