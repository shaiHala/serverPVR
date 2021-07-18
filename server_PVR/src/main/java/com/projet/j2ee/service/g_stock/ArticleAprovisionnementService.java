package com.projet.j2ee.service.g_stock;

import java.util.List;

import com.projet.j2ee.models.g_stock.ArticleApprovisionnement;

public interface ArticleAprovisionnementService {
	ArticleApprovisionnement saveArticleApprovisionnement(ArticleApprovisionnement aAp);
	ArticleApprovisionnement updateArticleApprovisionnement(ArticleApprovisionnement aAp);
	void deleteArticleApprovisionnement(ArticleApprovisionnement aAp);
	void deleteArticleApprovisionnementById(int  id);
	ArticleApprovisionnement getArticleApprovisionnement(int  id);
	List<ArticleApprovisionnement> getAllArticleApprovisionnements();
}
