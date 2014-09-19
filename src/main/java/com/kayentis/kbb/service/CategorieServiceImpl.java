package com.kayentis.kbb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kayentis.kbb.beans.Article;
import com.kayentis.kbb.beans.Categorie;
import com.kayentis.kbb.dao.CategorieDAO;

@Service
public class CategorieServiceImpl {
	
	private CategorieDAO categorieDAO;
	
	public void setCategorieDAO(CategorieDAO categorieDAO) {
		this.categorieDAO = categorieDAO;
	}


	public void addCategorie(Categorie categorie) {
		//TODO
	}
	
	public List<Categorie> findAll() {
		return categorieDAO.findAll();
	}
}
