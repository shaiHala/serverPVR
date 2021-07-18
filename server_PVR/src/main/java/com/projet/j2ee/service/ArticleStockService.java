package com.projet.j2ee.service;

import java.util.List;

import com.projet.j2ee.models.prime.ArticleStock;

public interface ArticleStockService {
	ArticleStock saveArticleStock(ArticleStock as);
	ArticleStock updateArticleStock(ArticleStock as);
	void deleteArticleStock(ArticleStock as);
	void deleteArticleStockById(int id);
	ArticleStock getArticleStock(int id);
	List<ArticleStock> getAllArticleStocks();
}
