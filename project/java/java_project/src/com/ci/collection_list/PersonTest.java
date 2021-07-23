package com.ci.collection_list;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person(1, "Ram", 10000);
		Person p2 = new Person(2, "Sham", 24000);
		Person p3 = new Person(3, "Sham", 18000);
		Person p4 = new Person(4, "Yash", 21000);
		Person p5 = new Person(5, "Sid", 14000);
		
		List<Person> allPerson = new ArrayList<>();
		
		allPerson.add(p1);
		allPerson.add(p2);
		allPerson.add(p3);
		allPerson.add(p4);
		allPerson.add(p5);
		
		System.out.println(allPerson);
		
		List<Person> above = new ArrayList<>();
		List<Person> below = new ArrayList<>();
		
		for(Person person : allPerson) {
			if (person.getSalary() > 18000) {
				above.add(person);
			} else {
				below.add(person);
			}
		}
		
		System.out.println("Above : " + above);
		System.out.println("Below : " + below);
	}

}
