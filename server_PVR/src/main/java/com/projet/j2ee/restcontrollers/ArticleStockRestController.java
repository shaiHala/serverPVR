package com.projet.j2ee.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projet.j2ee.models.g_stock.ArticleStock;
import com.projet.j2ee.service.g_stock.ArticleStockService;

@RestController
@RequestMapping("/articleStock")
@CrossOrigin
public class ArticleStockRestController {
	@Autowired
	ArticleStockService articleStockService;
	
	@RequestMapping(value="/all" ,method=RequestMethod.GET)
	public List<ArticleStock> getAllArticleStocks()
	{
		return articleStockService.getAllArticleStocks();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ArticleStock getArticleStockById(@PathVariable("id") int id) {
		return articleStockService.getArticleStock(id);
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public ArticleStock createArticleStock(@RequestBody ArticleStock articleStock) {
			return articleStockService.saveArticleStock(articleStock);
	}
		
	@RequestMapping(method = RequestMethod.POST)
	public ArticleStock updateArticleStock(@RequestBody ArticleStock articleStock) {
		return articleStockService.updateArticleStock(articleStock);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteArticleStock(@PathVariable("id") int id)
	{
		articleStockService.deleteArticleStockById(id);
	}
	
	
	
	
}
