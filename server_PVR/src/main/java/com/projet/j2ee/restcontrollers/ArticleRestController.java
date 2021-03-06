package com.projet.j2ee.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.j2ee.models.g_stock.Article;
import com.projet.j2ee.service.g_stock.ArticleService;

@RestController
@RequestMapping("/articles")
@CrossOrigin
public class ArticleRestController {
	@Autowired
	ArticleService articleService;
	
	@RequestMapping(value="/all" ,method=RequestMethod.GET)
	public List<Article> getAllArticles()
	{
		return articleService.getAllArticles();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Article getArticleById(@PathVariable("id") int id) {
		return articleService.getArticle(id);
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public Article createArticle(@RequestBody Article article) {
			return articleService.saveArticle(article);
	}
		
	@RequestMapping(method = RequestMethod.POST)
	public Article updateArticle(@RequestBody Article article) {
		return articleService.updateArticle(article);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteArticle(@PathVariable("id") int id)
	{
		articleService.deleteArticleById(id);
	}
	
	

}
