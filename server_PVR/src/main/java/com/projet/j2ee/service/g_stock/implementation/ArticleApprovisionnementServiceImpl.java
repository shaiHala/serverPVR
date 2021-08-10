package com.projet.j2ee.service.g_stock.implementation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.j2ee.models.g_stock.Article;
import com.projet.j2ee.models.g_stock.ArticleApprovisionnement;
import com.projet.j2ee.models.g_stock.ArticleStock;
import com.projet.j2ee.repos.g_stock.ArticleApprovisionnementRepository;
import com.projet.j2ee.service.g_stock.ArticleAprovisionnementService;
@Service 
public class ArticleApprovisionnementServiceImpl implements ArticleAprovisionnementService {
	@Autowired
	private SessionFactory sessionFactory;
	 
	
	@Autowired
	ArticleApprovisionnementRepository ArticleApprovisionnementRepository;
	@Autowired
	com.projet.j2ee.repos.g_stock.ArticleStockRepository articleStockRepository;
	
	@Override
	public ArticleApprovisionnement saveArticleApprovisionnement(ArticleApprovisionnement aAp) {
		  
		return ArticleApprovisionnementRepository.save(aAp) ;
	}

	@Override
	public ArticleApprovisionnement updateArticleApprovisionnement(ArticleApprovisionnement aAp) {
		
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
	
	public String test() {
        String sql = "Select MAX(qte) from article_stock where `article_codeArt`=123";
             
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery(sql);
        return query.getResultList().get(1).toString();
	}

}
