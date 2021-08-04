package com.ci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ci.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {

}
