package com.mav.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usersdemo_table")
public class User 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "first_name")
	private String firstname;
	
	@Column(name = "middle_name")
	private String middlename;
	
	@Column(name = "last_name")
	private String lastname;
	
	@Column(name = "phonenumber")
	private String phonenumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	@Column(name="dateOfBirth")
	private String dateOfBirth;
	
	@Column(name="gender")
	private String gender;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String firstname, String middlename, String lastname, String phonenumber, String email,
			String address, String dateOfBirth, String gender) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		this.email = email;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname
				+ ", phonenumber=" + phonenumber + ", email=" + email + ", address=" + address + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + "]";
	}
	
	


}
