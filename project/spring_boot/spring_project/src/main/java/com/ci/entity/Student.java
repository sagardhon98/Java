package com.ci.entity;

public class Student {

	private String username;
	private String password;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param username
	 * @param password
	 */
	public Student(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [username=" + username + ", password=" + password + "]";
	}

}
