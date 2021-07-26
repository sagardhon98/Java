package com.ci;

public class Student {

	private Integer id;
	private String name;
	private String email;
	private float fee;
	private String location;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
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
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
		
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param fee
	 * @param location
	 */
	public Student(Integer id, String name, String email, float fee, String location) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.fee = fee;
		this.location = location;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", fee=" + fee + ", location=" + location
				+ "]";
	}
	
	
	
}
