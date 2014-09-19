package com.kayentis.kbb.dao.basedao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Criterion;

/**
 * @author Romain
 *
 */
public interface GenericDAO <T, PK extends Serializable> {
	/**
	 * Create a new instance
	 * 
	 * @param newInstance
	 * @return the new instance
	 */
	PK create(T newInstance);

	/**
	 * Read by technical identifier
	 * 
	 * @param id
	 * @return instance object
	 */
	T read(PK id);
	
	/**
	 * Read object from database
	 * 
	 * @param instance
	 * @return reloaded object
	 */
	T reload(T instance);

	/**
	 * Read all items
	 * 
	 * @return objects list
	 */
	List<T> readAll();

	/**
	 * Read items by criteria
	 * 
	 * @param criterion
	 * @return objects lits
	 */
	List<T> readByCriteria(Criterion... criterion);
	
	/**
	 * Update data of transient object
	 * 
	 * @param transientObject
	 */
	void update(T transientObject);

	/**
	 * Delete persistent object
	 * 
	 * @param persistentObject
	 */
	void delete(T persistentObject);
	
	/**
	 * Update persistent object if existing into the database or create persistent object
	 * 
	 * @param transientObject
	 */
	void createOrUpdate(T transientObject);
}