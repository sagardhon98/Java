package com.ci.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data

@Entity
public class Student {
	
	@Id
	private Long id;
	private String name;
	private String email;
	private String place;
	private float fee;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}
	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}
	/**
	 * @return the fee
	 */
	public float getFee() {
		return fee;
	}
	/**
	 * @param fee the fee to set
	 */
	public void setFee(float fee) {
		this.fee = fee;
	}
	
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param place
	 * @param fee
	 */
	public Student(Long id, String name, String email, String place, float fee) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.place = place;
		this.fee = fee;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", place=" + place + ", fee=" + fee + "]";
	}
	
	
	
	
	
}
