package com.author.app;

import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.Session;

import com.author.data.Person;
import com.author.hbn.HibernateUtil;

public class AddPerson {

	public static void main(String[] args) {
		AddPerson ap = new AddPerson();
	}

	private void listPersons() {
	}

	private void addPerson() {
	}
	
	private Person getPerson(){
		Person p = new Person();
		p.setAge(12);
		p.setCountry("India");
		p.setDOB(new GregorianCalendar(12,12,1977).getTime());
		p.setEmail("manoj@test.com");
		p.setPersonName("Manoj K");
		return p;
		
	}

}
