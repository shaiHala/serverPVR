package com.projet.j2ee.service;

import java.util.List;

import com.projet.j2ee.models.prime.Article;

public interface ArticleService {
	Article saveArticle(Article ar);
	Article updateArticle(Article ar);
	void deleteArticle(Article ar);
	void deleteArticleById(int codeAr);
	Article getArticle(int codeAr);
	List<Article> getAllArticles();
}
