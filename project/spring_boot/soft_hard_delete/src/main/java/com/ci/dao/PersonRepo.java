package com.ci.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ci.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {
	
	List<Person> findByActiveTrue();

}
