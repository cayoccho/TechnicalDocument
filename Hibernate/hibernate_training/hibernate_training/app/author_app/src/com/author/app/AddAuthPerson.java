package com.author.app;

import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.author.data.Author;
import com.author.data.Person;
import com.author.data.Work;
import com.author.data.subclass.FactWork;
import com.author.hbn.HibernateUtil;

public class AddAuthPerson {
	public static void main(String[] args) {
		AddAuthPerson aap = new AddAuthPerson();

	}

	private void addAuthPerson() {
	}
	
	private void getListOfAuthPersons() {
	}

	
	private Person getPerson(){
		Person p = new Person();
		p.setAge(12);
		p.setCountry("India");
		p.setDOB(new GregorianCalendar(12,12,1977).getTime());
		p.setEmail("james@java.com");
		p.setPersonName("James Gosling");
		return p;
	}
	
	private Set getWorks(int i){
		HashSet hs = new HashSet();
		Work w = null;
		for(int j=0; j<i; j++){
			//w = new FactWork();
			w = new Work();
			w.setWorkName(" Java 1.5 primer");
			w.setWorkCategory("Fact");
			w.setValue(34.0);
			w.setCopiesSold(300);
			hs.add(w);
		}
		return hs;
	}
	private Author getAuth(){
		Author auth = new Author();
		auth.setIsAlive("Y");
		auth.setNickName("Techdude");
		auth.setPublisherName("Harper Collins");
		return auth;
	}

}
