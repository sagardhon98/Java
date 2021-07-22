package com.ci.controller.form;

public class Student {

	private String name;
	private String username;
	private String password;
	private String email;
	private String dob;
	private String gender;
	private String phn;
	private String address;
	private String language;
	private String education;
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
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the phn
	 */
	public String getPhn() {
		return phn;
	}
	/**
	 * @param phn the phn to set
	 */
	public void setPhn(String phn) {
		this.phn = phn;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}
	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}
	
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param name
	 * @param username
	 * @param password
	 * @param email
	 * @param dob
	 * @param gender
	 * @param phn
	 * @param address
	 * @param language
	 * @param education
	 */
	public Student(String name, String username, String password, String email, String dob, String gender, String phn,
			String address, String language, String education) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.phn = phn;
		this.address = address;
		this.language = language;
		this.education = education;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", dob=" + dob + ", gender=" + gender + ", phn=" + phn + ", address=" + address + ", language="
				+ language + ", education=" + education + "]";
	}
	
	
	
	
	
}
