package com.author.listener;

import org.hibernate.event.PreUpdateEvent;
import org.hibernate.event.PreUpdateEventListener;

public class UpdateListener implements PreUpdateEventListener {

	public boolean onPreUpdate(PreUpdateEvent evnt) {
		return false;

	}

}
