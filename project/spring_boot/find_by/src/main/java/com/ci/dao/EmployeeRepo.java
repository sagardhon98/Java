package com.ci.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ci.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	Employee findByName(String name);
	List<Employee> findBySalary(Double salary);
}
