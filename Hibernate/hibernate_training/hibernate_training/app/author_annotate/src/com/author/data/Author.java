package com.author.data;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



public class Author {

	private int authId;
	private String nickName;
	private String publisherName;
	private String isAlive;
	private Person person;
	private Set work;


	public int getAuthId() {
		return authId;
	}


	public String getIsAlive() {
		return isAlive;
	}

	public String getNickName() {
		return nickName;
	}

	public String getPublisherName() {
		return publisherName;
	}


	public Person getPerson() {
		return person;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="author_work",
            joinColumns = { @JoinColumn( name="author_id") },
            inverseJoinColumns = @JoinColumn( name="work_id")
    )
	public Set<Work> getWork() {
		return work;
	}

	
	public void setAuthId(int authId) {
		this.authId = authId;
	}
	public void setIsAlive(String isAlive) {
		this.isAlive = isAlive;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public void setWork(Set work) {
		this.work = work;
	}
}
