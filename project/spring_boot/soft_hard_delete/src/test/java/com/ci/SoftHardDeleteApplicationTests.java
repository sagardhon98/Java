package com.ci;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ci.dao.PersonRepo;
import com.ci.entity.Person;

@SpringBootTest
class SoftHardDeleteApplicationTests {

	@Autowired
	PersonRepo personRepo;
	
	//insert data
	@Test
	public void testInsertData() {
		Person person = new Person("B", "b@gmail.com", "Vashi");
		person.setId(2L);
		Person insertData = personRepo.save(person);
		System.out.println("Data save Successfully." + insertData);
	}
	
	//hard delete
	@Test
	public void testHardDelete() {
		personRepo.deleteById(2L);
		System.out.println("Data delete Successfully.");
	}
	
	//get all data by active true
	@Test
	public void testAllActiveTrue() {
		List<Person> allActive =  personRepo.findByActiveTrue();
		allActive.forEach(e->{
			System.out.println("Active True Data : " + e);
		});
	}
	
	//soft delete
	@Test
	public void testSoftDelete() {
		Long id = 2L;
		Person p1 = personRepo.findById(id).get();
		System.out.println(p1);
		p1.setActive(false);
		personRepo.save(p1);
	}

}
