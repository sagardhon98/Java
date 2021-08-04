package com.ci.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	private String location;
	
	//flag
	private Boolean active = false;

	/**
	 * @param name
	 * @param email
	 * @param location
	 * @param active
	 */
	public Person(String name, String email, String location) {
		this.name = name;
		this.email = email;
		this.location = location;
	}
	
	
}
