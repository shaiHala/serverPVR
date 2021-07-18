package com.projet.j2ee.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.j2ee.models.g_stock.ArticleApprovisionnement;
import com.projet.j2ee.service.g_stock.ArticleAprovisionnementService;

@RestController
@RequestMapping("/articleAppro")
@CrossOrigin
public class ArticleApprovisionnementRestController {
	
	@Autowired
	ArticleAprovisionnementService articleAprovisionnementService;
	
	@RequestMapping(value="/all" ,method=RequestMethod.GET)
	public List<ArticleApprovisionnement> getAllArticleStocks()
	{
		return articleAprovisionnementService.getAllArticleApprovisionnements();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ArticleApprovisionnement getArticleStockById(@PathVariable("id") int id) {
		return articleAprovisionnementService.getArticleApprovisionnement(id);
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public ArticleApprovisionnement createArticleStock(@RequestBody ArticleApprovisionnement articleApro) {
			return articleAprovisionnementService.saveArticleApprovisionnement(articleApro);
	}
		
	@RequestMapping(method = RequestMethod.POST)
	public ArticleApprovisionnement updateArticleStock(@RequestBody ArticleApprovisionnement articleApro) {
		return articleAprovisionnementService.updateArticleApprovisionnement(articleApro);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteArticleStock(@PathVariable("id") int id)
	{
		articleAprovisionnementService.deleteArticleApprovisionnementById(id);
	}
	
	
	
	
}
