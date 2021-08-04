package com.ci;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.ci.dao.PersonRepo;
import com.ci.entity.Person;

@SpringBootTest
class PaginationPart1ApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	@Autowired
	PersonRepo personRepo;
	
	//insert person data
	@Test
	public void savePerson() {
		Person person = new Person(5L, "E", "e@gmail.com");
		personRepo.save(person);
		System.out.println("Data saved Successfully");
	}
	
	//pagination
	@Test
	public void testPagination() {
		int pageNo = 1;
		int pageSize = 3;
		
		PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
		Page<Person> findAll = personRepo.findAll(pageRequest);
		List<Person> content = findAll.getContent();
		
		System.out.println(content);
		
		System.out.println(findAll);
	}
}
