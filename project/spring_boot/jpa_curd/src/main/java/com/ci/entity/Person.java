package com.ci.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Person {

	@Id
	private Long id;
	private String name;
	private String email;
	private String address;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param address
	 */
	public Person(Long id, String name, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
	
	
}
