package com.projet.j2ee.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.projet.j2ee.models.prime.Fournisseur;
import com.projet.j2ee.repos.prime.FournisseurRepository;
import com.projet.j2ee.service.FournisseurService;

public class FournisseurServiceImpl implements FournisseurService {

	@Autowired
	FournisseurRepository FournisseurRepository;
	
	@Override
	public Fournisseur saveFournisseur(Fournisseur fr) {
	
		return FournisseurRepository.save(fr) ;
	}

	@Override
	public Fournisseur updateFournisseur(Fournisseur fr) {
		// TODO Auto-generated method stub
		return FournisseurRepository.save(fr);
	}

	@Override
	public void deleteFournisseur(Fournisseur fr) {
		FournisseurRepository.delete(fr);

	}

	@Override
	public void deleteFournisseurById(int codefr) {
		// TODO Auto-generated method stub
		FournisseurRepository.deleteById(codefr);
	}

	@Override
	public Fournisseur getFournisseur(int codefr) {
		// TODO Auto-generated method stub
		return FournisseurRepository.findById(codefr).get();
	}

	@Override
	public List<Fournisseur> getAllFournisseurs() {
		// TODO Auto-generated method stub
		return FournisseurRepository.findAll();
	}


}
