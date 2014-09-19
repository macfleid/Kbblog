package com.kayentis.kbb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.kayentis.kbb.beans.Article;
import com.kayentis.kbb.beans.Categorie;
import com.kayentis.kbb.dao.ArticleDAO;
import com.kayentis.kbb.dao.CategorieDAO;

public class ArticleServiceImpl {
	
	private CategorieDAO categorieDAO;
	private ArticleDAO articleDAO;

	public void setCategorieDAO(CategorieDAO categorieDAO) {
		this.categorieDAO = categorieDAO;
	}

	public void setArticleDAO(ArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}

	public List<Article> findAll() {
		return articleDAO.findAll();
	}
	
	public List<Article> getByCategorie(String name) {
		return articleDAO.getByCategorie(name);
	}
	
	public Article getArticle(int id) {
		return articleDAO.getById(id);
	}
	
	public void save(Article article) {
		articleDAO.save(article);
	}
}
