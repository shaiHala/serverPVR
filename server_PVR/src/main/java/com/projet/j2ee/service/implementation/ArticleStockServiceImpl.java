package com.projet.j2ee.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.projet.j2ee.models.prime.ArticleStock;
import com.projet.j2ee.repos.prime.ArticleStockRepository;
import com.projet.j2ee.service.ArticleStockService;

public class ArticleStockServiceImpl implements ArticleStockService {

	@Autowired
	ArticleStockRepository ArticleStockRepository;
	
	@Override
	public ArticleStock saveArticleStock(ArticleStock as) {
	
		return ArticleStockRepository.save(as) ;
	}

	@Override
	public ArticleStock updateArticleStock(ArticleStock as) {
		// TODO Auto-generated method stub
		return ArticleStockRepository.save(as);
	}

	@Override
	public void deleteArticleStock(ArticleStock as) {
		ArticleStockRepository.delete(as);

	}

	@Override
	public void deleteArticleStockById(int id) {
		// TODO Auto-generated method stub
		ArticleStockRepository.deleteById(id);
	}

	@Override
	public ArticleStock getArticleStock(int id) {
		// TODO Auto-generated method stub
		return ArticleStockRepository.findById(id).get();
	}

	@Override
	public List<ArticleStock> getAllArticleStocks() {
		// TODO Auto-generated method stub
		return ArticleStockRepository.findAll();
	}


}
