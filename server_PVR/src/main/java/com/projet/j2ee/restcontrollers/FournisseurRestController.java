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
import com.projet.j2ee.models.g_stock.Fournisseur;
import com.projet.j2ee.service.g_stock.ArticleAprovisionnementService;
import com.projet.j2ee.service.g_stock.FournisseurService;

@RestController
@RequestMapping("/fournisseur")
@CrossOrigin
public class FournisseurRestController {
	@Autowired
	FournisseurService fournisseurService;
	
	@RequestMapping(value="/all" ,method=RequestMethod.GET)
	public List<Fournisseur> getAll()
	{
		return fournisseurService.getAllFournisseurs();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Fournisseur getArticleApprovisionnementById(@PathVariable("id") int id) {
		return fournisseurService.getFournisseur(id);
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public Fournisseur createFournisseur(@RequestBody Fournisseur fr) {
			return fournisseurService.saveFournisseur(fr);
	}
		
	@RequestMapping(method = RequestMethod.POST)
	public Fournisseur updateArticleApprovisionnement(@RequestBody Fournisseur fr) {
		return fournisseurService.updateFournisseur(fr);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteArticleApprovisionnement(@PathVariable("id") int id)
	{
		fournisseurService.deleteFournisseurById(id);
	}
}
