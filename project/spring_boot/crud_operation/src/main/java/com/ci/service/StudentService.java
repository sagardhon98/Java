package com.ci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ci.dao.StudentRepo;
import com.ci.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;

	//insert data
	public Student insertStudentData(Student stud) {
		Student student = studentRepo.save(stud);
		return student;
	}
	
	//get data
	public List<Student> getAllStudent(){
		List<Student> allStudent = studentRepo.findAll();
		return allStudent;
	}

	//delete data
	public void deleteStudentById(Long id) {
		studentRepo.deleteById(id);
	}
}
