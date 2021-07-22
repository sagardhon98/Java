package com.ci.dao;

import org.springframework.data.repository.CrudRepository;

import com.ci.entity.Person;

public interface PersonDao extends CrudRepository<Person, Long> {

}
