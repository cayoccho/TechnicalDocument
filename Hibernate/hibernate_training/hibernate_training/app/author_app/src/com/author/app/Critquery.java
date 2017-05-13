package com.author.app;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

import com.author.data.Author;
import com.author.hbn.HibernateUtil;

public class Critquery {

	public static void main(String[] args) {
		Critquery cq = new Critquery();
		cq.executeCriteriaQuery();
		cq.executeNativeQuery();

	}


	private void executeCriteriaQuery() {
	}
	private void executeNativeQuery() {
	}


}
