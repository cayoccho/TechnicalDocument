package com.author.app;

import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

import com.author.data.Author;
import com.author.data.Person;
import com.author.data.Work;

public class AddPerson {

	public static void main(String[] args) {
	}
	private void addAuthPerson() {
	}
	
	private Person getPerson(){
		Person p = new Person();
		p.setAge(12);
		p.setCountry("India");
		p.setDOB(new GregorianCalendar(12,12,1977).getTime());
		p.setEmail("gavin@annotation.com");
		p.setPersonName("Gavin King");
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
