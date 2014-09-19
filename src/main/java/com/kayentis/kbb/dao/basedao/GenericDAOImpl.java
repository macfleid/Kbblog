package com.kayentis.kbb.dao.basedao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;

public class GenericDAOImpl <T, PK extends Serializable> extends SpringDaoSupport implements GenericDAO<T, PK> {

	private Class<T> type;

	/**
	 * @param type
	 */
	public GenericDAOImpl(Class<T> type) {
		this.type = type;
	}

	@Override
	@SuppressWarnings("unchecked")
	public PK create(T object) {
		return (PK) getSession().save(object);
	}

	@Override
	@SuppressWarnings("unchecked")
	public T read(PK id) {
		return (T) getSession().get(type, id);
	}

	@Override
	public List<T> readAll() {
		return readByCriteria();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<T> readByCriteria(Criterion... criterion) {
		Criteria crit = getSession().createCriteria(type);
		for (Criterion c : criterion) {
			crit.add(c);
		}
		return crit.list();
	}

	@Override
	public void update(T transientObject) {
		getSession().update(transientObject);
	}

	@Override
	public void delete(T transientObject) {
		getSession().delete(transientObject);
	}
	
	@Override
	public void createOrUpdate(T transientObject) {
		getSession().saveOrUpdate(transientObject);
	}

	@Override
	public T reload(T instance) {
		getSession().refresh(instance);
		return instance;
	}
}
