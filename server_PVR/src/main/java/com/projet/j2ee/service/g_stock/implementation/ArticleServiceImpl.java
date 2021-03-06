package com.projet.j2ee.service.g_stock.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.j2ee.models.g_stock.Article;
import com.projet.j2ee.repos.g_stock.ArticleRepository;
import com.projet.j2ee.service.g_stock.ArticleService;
@Service 
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	ArticleRepository articleRepository;
	
	@Override
	public Article saveArticle(Article ar) {
	
		return articleRepository.save(ar) ;
	}

	@Override
	public Article updateArticle(Article ar) {
		// TODO Auto-generated method stub
		return articleRepository.save(ar);
	}

	@Override
	public void deleteArticle(Article ar) {
		articleRepository.delete(ar);

	}

	@Override
	public void deleteArticleById(int codeAr) {
		// TODO Auto-generated method stub
		articleRepository.deleteById(codeAr);
	}

	@Override
	public Article getArticle(int codeAr) {
		// TODO Auto-generated method stub
		return articleRepository.findById(codeAr).get();
	}

	@Override
	public List<Article> getAllArticles() {
		// TODO Auto-generated method stub
		return articleRepository.findAll();
	}

}
