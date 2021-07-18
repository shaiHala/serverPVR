package com.projet.j2ee.service.g_stock.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.j2ee.models.g_stock.ArticleApprovisionnement;
import com.projet.j2ee.repos.g_stock.ArticleApprovisionnementRepository;
import com.projet.j2ee.service.g_stock.ArticleAprovisionnementService;
@Service 
public class ArticleApprovisionnementServiceImpl implements ArticleAprovisionnementService {

	@Autowired
	ArticleApprovisionnementRepository ArticleApprovisionnementRepository;
	
	@Override
	public ArticleApprovisionnement saveArticleApprovisionnement(ArticleApprovisionnement aAp) {
	
		return ArticleApprovisionnementRepository.save(aAp) ;
	}

	@Override
	public ArticleApprovisionnement updateArticleApprovisionnement(ArticleApprovisionnement aAp) {
		// TODO Auto-generated method stub
		return ArticleApprovisionnementRepository.save(aAp);
	}

	@Override
	public void deleteArticleApprovisionnement(ArticleApprovisionnement aAp) {
		ArticleApprovisionnementRepository.delete(aAp);

	}

	@Override
	public void deleteArticleApprovisionnementById(int id) {
		// TODO Auto-generated method stub
		ArticleApprovisionnementRepository.deleteById(id);
	}

	@Override
	public ArticleApprovisionnement getArticleApprovisionnement(int id) {
		// TODO Auto-generated method stub
		return ArticleApprovisionnementRepository.findById(id).get();
	}

	@Override
	public List<ArticleApprovisionnement> getAllArticleApprovisionnements() {
		// TODO Auto-generated method stub
		return ArticleApprovisionnementRepository.findAll();
	}

}
