package com.ci.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ci.dao.StudentRepo;
import com.ci.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;

	public Student insertStudentData(Student stud) {
		Student student = studentRepo.save(stud);
		return student;
	}
}
