package com.author.listener;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import com.author.data.Author;

public class SaveInterceptor extends EmptyInterceptor {

	public boolean onSave(Object entity,
            Serializable id,
            Object[] state,
            String[] propertyNames,
            Type[] types) {
				return false;
		}

}
