package com.ci.controller.form;

public class EmpLogin {

	private String empName;
	private String email;
	private String mobile;
	private String address;
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
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
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	
	
	
	public EmpLogin() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param empName
	 * @param email
	 * @param mobile
	 * @param address
	 */
	public EmpLogin(String empName, String email, String mobile, String address) {
		super();
		this.empName = empName;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmpLogin [empName=" + empName + ", email=" + email + ", mobile=" + mobile + ", address=" + address
				+ "]";
	}
	
	
	
	
}
