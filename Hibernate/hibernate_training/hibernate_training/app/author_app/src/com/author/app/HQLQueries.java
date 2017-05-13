package com.author.app;

import java.util.List;

import org.hibernate.Session;

import com.author.data.Author;
import com.author.hbn.HibernateUtil;

public class HQLQueries {


	public static void main(String[] args) {
		HQLQueries hql = new HQLQueries();
		hql.getAuthorList(3);
		hql.getMaxWorksAuthor();
		hql.getAuthorAvgAge();
		hql.searchAuthor();
	}

	public void getAuthorList(int bookCount){
	}
	public void getMaxWorksAuthor(){
	}
	public void getAuthorAvgAge(){
	}
	public void searchAuthor(){
	}
}
