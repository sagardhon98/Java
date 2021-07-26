package com.ci;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ci.dao.EmployeeRepo;
import com.ci.entity.Employee;

@SpringBootTest
class FindByApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	EmployeeRepo empRepo;
	
	//insert data
	@Test
	public void testInsertEmployee() {
		Employee emp = new Employee(3L, "Anuj", "anuj@gmail.com", "Thane", 15000.0);
		empRepo.save(emp);
		System.out.println("Data insert Successfully.");
	}
	
	//find by name
	public void testFindByName() {
		Employee empName = empRepo.findByName("Rohit");
		System.out.println("Find by name Successfully. " + empName);
	}

	//find by salary
	@Test
	public void testFindBySalary() {
		List<Employee> empSalary =  empRepo.findBySalary(15000.0);
		System.out.println("Find by salary Successfully. " + empSalary);
	}
}
