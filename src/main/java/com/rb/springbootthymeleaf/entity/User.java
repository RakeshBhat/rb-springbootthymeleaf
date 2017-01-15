package com.rb.springbootthymeleaf.entity;

import java.util.Date;

public class User {

	int roleId;
	String message;
	String fname;
	String lname;
	Date dateOfBirth;
	String mphone;
	String email;
	String address;
	String feedback;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return String.format(
				"User [roleId=%s, message=%s, fname=%s, lname=%s, dateOfBirth=%s, mphone=%s, email=%s, address=%s, feedback=%s]",
				roleId, message, fname, lname, dateOfBirth, mphone, email, address, feedback);
	}
	
	
	
}
