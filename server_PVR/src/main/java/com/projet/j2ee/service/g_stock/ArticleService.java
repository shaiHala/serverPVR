package com.projet.j2ee.service.g_stock;

import java.util.List;

import com.projet.j2ee.models.g_stock.Article;

public interface ArticleService {
	Article saveArticle(Article ar);
	Article updateArticle(Article ar);
	void deleteArticle(Article ar);
	void deleteArticleById(int codeAr);
	Article getArticle(int codeAr);
	List<Article> getAllArticles();
}
