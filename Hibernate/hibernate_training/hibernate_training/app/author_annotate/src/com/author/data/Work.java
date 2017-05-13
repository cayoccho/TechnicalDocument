package com.author.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="work")
public class Work {
	
	private int workId;
	private String workName;
	private String workCategory;
	private int copiesSold;
	private Double value;

	@Column(name="work_copies_sold")
	public int getCopiesSold() {
		return copiesSold;
	}

	@Column(name="work_value")
	public Double getValue() {
		return value;
	}

	@Column(name="work_category")
	public String getWorkCategory() {
		return workCategory;
	}

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="work_id")
	public int getWorkId() {
		return workId;
	}

	@Column(name="work_name")
	public String getWorkName() {
		return workName;
	}

	public void setCopiesSold(int copiesSold) {
		this.copiesSold = copiesSold;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public void setWorkCategory(String workCategory) {
		this.workCategory = workCategory;
	}

	public void setWorkId(int workId) {
		this.workId = workId;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

}
