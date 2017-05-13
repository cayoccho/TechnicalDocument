package com.author.bidirection.data;

import java.util.Set;

public class AuthorBD {

	private int authId;
	private String nickName;
	
	private String publisherName;
	private String isAlive;
	private PersonBD person;
	private Set workBD;
	
	
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
	public PersonBD getPerson() {
		return person;
	}
	public void setPerson(PersonBD person) {
		this.person = person;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public Set getWorkBD() {
		return workBD;
	}
	public void setWorkBD(Set workBD) {
		this.workBD = workBD;
	}

}
