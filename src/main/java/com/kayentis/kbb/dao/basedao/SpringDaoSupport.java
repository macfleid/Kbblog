package com.kayentis.kbb.dao.basedao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SpringDaoSupport {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	protected Session getSession() {
		return getSessionFactory().getCurrentSession();
	}
	
}