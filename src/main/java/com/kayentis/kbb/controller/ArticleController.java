package com.kayentis.kbb.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.HtmlUtils;

import com.kayentis.kbb.beans.Article;
import com.kayentis.kbb.service.ArticleServiceImpl;
import com.kayentis.kbb.service.CategorieServiceImpl;

@Controller
public class ArticleController {
	
	private final static int pageSize = 4 ;
	
	private ArticleServiceImpl articleService;
	private CategorieServiceImpl categorieService;
	
	@Resource(name="Categorie_")
	public void setCategorieService(CategorieServiceImpl categorieService) {
		this.categorieService = categorieService;
	}

	@Resource(name="Article_")
	public void setArticleService(ArticleServiceImpl articleService) {
		this.articleService = articleService;
	}
	

	@RequestMapping("/articles")
	public ModelAndView article(@RequestParam(value="page", required = false, defaultValue="0") int page) {
		ModelAndView view = new ModelAndView();
		view.setViewName("Article_list");
		
		List<Article> listArticle = articleService.findAll();
//		view.addObject("listArticle", listArticle);
		
		PagedListHolder<Article> pageListArticle = new PagedListHolder<Article>(listArticle);
		pageListArticle.setPageSize(pageSize);
		pageListArticle.setPage(page);
		
		view.addObject("listArticle", pageListArticle.getPageList());
		view.addObject("pageCount", pageListArticle.getPageCount());
		view.addObject("page", pageListArticle.getPage());
		return view;
	}
	
	@RequestMapping(value="/articles/{cat}")
	public ModelAndView articleByCategorie(@PathVariable String cat) {
		ModelAndView view = new ModelAndView();
		view.setViewName("Article_list");
		
		List<Article> listArticle = articleService.getByCategorie(cat);
		view.addObject("listArticle", listArticle);
		view.addObject("pageCount", 1);
		view.addObject("page", 0);
		
		return view;
	}
	
	@RequestMapping(value="/article/{id}")
	public ModelAndView readArticle(@PathVariable int id) {
		ModelAndView view = new ModelAndView();
		Article article = articleService.getArticle(id);
		view.setViewName("Article");
		view.addObject("article", article);
		return view;
	}
	
	@RequestMapping(value="/submit/article")
	public ModelAndView submitArticle() {
		ModelAndView view = new ModelAndView();
		view.setViewName("submit_article");
		Article article = new Article();
		view.addObject("article",article);
		view.addObject("listCategories", categorieService.findAll());
		return view;
	}
	
	@RequestMapping(value="/edit/article/{id}")
	public ModelAndView editArticle(@PathVariable int id) {
		ModelAndView view = new ModelAndView();
		view.setViewName("submit_article");
		Article article = articleService.getArticle(id);
		view.addObject("article",article);
		view.addObject("listCategories", categorieService.findAll());
		return view;
	}
	
	@RequestMapping(value="/submit/article/save")
	public ModelAndView saveArticle(@ModelAttribute(value="article") Article article) {
		article.setDate(new Date());
		System.out.println("Article:"+article);
		article.setText(article.getText());
		this.articleService.save(article);
		
		ModelAndView view = new ModelAndView();
		List<Article> listArticle = articleService.findAll();
		view.setViewName("Article_list");
		PagedListHolder<Article> pageListArticle = new PagedListHolder<Article>(listArticle);
		pageListArticle.setPageSize(pageSize);
		pageListArticle.setPage(0);
		view.addObject("listArticle", pageListArticle.getPageList());
		view.addObject("pageCount", pageListArticle.getPageCount());
		view.addObject("page", pageListArticle.getPage());
		return view;
	}
	
	
}
