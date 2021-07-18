package com.projet.j2ee.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.j2ee.models.prime.Article;
import com.projet.j2ee.service.ArticleService;

@RestController
@RequestMapping("/articles")
@CrossOrigin
public class ArticleRestController {
	@Autowired
	ArticleService ArticleService;
	
	@RequestMapping(value="/all" ,method=RequestMethod.GET)
	public List<Article> getAllArticles()
	{
		return ArticleService.getAllArticles();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Article getArticleById(@PathVariable("id") int id) {
		return ArticleService.getArticle(id);
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public Article createArticle(@RequestBody Article Article) {
			return ArticleService.saveArticle(Article);
	}
		
	@RequestMapping(method = RequestMethod.POST)
	public Article updateArticle(@RequestBody Article Article) {
		return ArticleService.updateArticle(Article);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteArticle(@PathVariable("id") int id)
	{
			ArticleService.deleteArticleById(id);
	}
	
	

}
