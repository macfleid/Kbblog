package com.kayentis.kbb.dao;

import java.util.List;

import org.hibernate.Hibernate;

import com.kayentis.kbb.beans.Article;
import com.kayentis.kbb.beans.Categorie;
import com.kayentis.kbb.dao.basedao.GenericDAOImpl;

public class ArticleDAO  extends GenericDAOImpl<Article, Integer> implements IArticleDAO {

	public ArticleDAO(Class<Article> type) {
		super(type);
	}
	
	@SuppressWarnings("unchecked")
	public List<Article> findAll() {
		List<Article> result = (List<Article>) getSession().createQuery("select article from Article article "
				+ "join article.categorie categorie  "
//				+ "order by Convert(datetime, article.date) asc ").list();
				+ "order by DATE_FORMAT(article.date, '%d-%M-%Y') DESC ").list();
		for(Article article : result) {
			Hibernate.initialize(article.getCategorie());
		}
		return result;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Article> getByCategorie(String categorieName) {
		List<Article> result =  (List<Article>) getSession().createQuery("select article from Article article "
				
				+ "where categorie.name=:n order by article.date")
				.setParameter("n", categorieName)
				.list();
		for(Article article : result) {
			Hibernate.initialize(article.getCategorie());
		}
		return result;
	}
	
	public Article getById(int id) {
		return (Article) getSession().createQuery("from Article article where article.id=:id")
				.setParameter("id", id).uniqueResult();
	}
	
	public void save(Article article) {
		createOrUpdate(article);
	}

}
