package com.author.data;

import java.util.Set;

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
	public void setAuthId(int authId) {
		this.authId = authId;
	}
	public String getIsAlive() {
		return isAlive;
	}
	public void setIsAlive(String isAlive) {
		this.isAlive = isAlive;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public Set getWork() {
		return work;
	}
	public void setWork(Set work) {
		this.work = work;
	}
}
