package com.ci;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ci.dao.StudentRepo;
import com.ci.entity.Student;

@SpringBootTest
class FindByApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	StudentRepo studRepo;
	
	

}
