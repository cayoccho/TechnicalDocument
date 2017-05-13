package com.author.data;

public class Work {
private int workId;
private String workName;
private String workCategory;
private int copiesSold;
private Double value;
public int getCopiesSold() {
	return copiesSold;
}
public void setCopiesSold(int copiesSold) {
	this.copiesSold = copiesSold;
}
public Double getValue() {
	return value;
}
public void setValue(Double value) {
	this.value = value;
}
public String getWorkCategory() {
	return workCategory;
}
public void setWorkCategory(String workCategory) {
	this.workCategory = workCategory;
}
public int getWorkId() {
	return workId;
}
public void setWorkId(int workId) {
	this.workId = workId;
}
public String getWorkName() {
	return workName;
}
public void setWorkName(String workName) {
	this.workName = workName;
}


}
