package com.author.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	private int personId;
	private String personName;
	private Date DOB;
	private int age;
	private String country;
	private String email;


	public int getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}

	public Date getDOB() {
		return DOB;
	}

	public String getEmail() {
		return email;
	}

	public int getPersonId() {
		return personId;
	}

	public String getPersonName() {
		return personName;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setDOB(Date dob) {
		DOB = dob;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}

}
