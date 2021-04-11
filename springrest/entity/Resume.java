package com.springrest.springrest.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Resume {
	
	@Id
	private String FirstName;
	private String LastName;
	private Date DateOfBirth;
	private String Address;
	private int Phone;
    private String Email;
    
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Resume() {
		super();
		
	}
	public Resume(String firstName, String lastName, Date dateOfBirth, String address, int phone, String email) {
		super();
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		Address = address;
		Phone = phone;
		Email = email;
	}
	@Override
	public String toString() {
		return "Resume [FirstName=" + FirstName + ", LastName=" + LastName + ", DateOfBirth=" + DateOfBirth
				+ ", Address=" + Address + ", Phone=" + Phone + ", Email=" + Email + "]";
	}
}
