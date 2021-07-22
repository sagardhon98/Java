package com.ci;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ci.dao.PersonDao;
import com.ci.entity.Person;

@SpringBootTest
class JpaCurdApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Autowired
	PersonDao personDao;

	// insert data
	@Test
	public void savePerson() {
		Person person = new Person(4L, "Yash", "yash@gmail.com", "Vashi");
		personDao.save(person);
		System.out.println("Data Insert Successfully.");
	}

	// update data
	@Test
	public void updatePerson() {
		Person person = new Person(3L, "Sagar", "sagar123@gmail.com", "Ghansoli");
		personDao.save(person);
		System.out.println("Data Update Successfully");
	}

	// delete data by id
	@Test
	public void deletePerson() {
		personDao.deleteById(2L);
		System.out.println("Data Delete Successfully");
	}

	// single data fetch
	@Test
	public void getPerson() {
		Optional<Person> person = personDao.findById(1L);
		System.out.println("Single data fetch Successfully " + person.get());
	}

	// all data fetch
	@Test
	public void fetchAll() {
		Iterable<Person> person = personDao.findAll();
		System.out.println("All data fetch Successfully " + person);
	}
	
	// delete all data
	@Test
	public void deleteAllPerson() {
		personDao.deleteAll();
		System.out.println("All Data delete Successfully");
		
	}

}
