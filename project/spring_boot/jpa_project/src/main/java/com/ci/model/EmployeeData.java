package com.ci.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeData {

	@Id
	private Integer id;
	private String name;
	private float salary;
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
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
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
	
	
	public EmployeeData() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param id
	 * @param name
	 * @param salary
	 * @param location
	 */
	public EmployeeData(Integer id, String name, float salary, String location) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.location = location;
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeData [id=" + id + ", name=" + name + ", salary=" + salary + ", location=" + location + "]";
	}
	
	
	
	
}
