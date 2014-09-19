package com.kayentis.kbb.dao;

import java.util.List;

import com.kayentis.kbb.beans.Article;
import com.kayentis.kbb.beans.Categorie;
import com.kayentis.kbb.dao.basedao.GenericDAOImpl;

public class CategorieDAO extends GenericDAOImpl<Categorie, Integer> implements ICategorieDAO {

	public CategorieDAO(Class<Categorie> type) {
		super(type);
	}
	
	@SuppressWarnings("unchecked")
	public List<Categorie> findAll() {
		return (List<Categorie>) getSession().createCriteria(Categorie.class).list();
	}

}
