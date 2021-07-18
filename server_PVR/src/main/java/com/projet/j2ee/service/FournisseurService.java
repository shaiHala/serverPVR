package com.projet.j2ee.service;

import java.util.List;

import com.projet.j2ee.models.prime.Fournisseur;

public interface FournisseurService {
	Fournisseur saveFournisseur(Fournisseur fr);
	Fournisseur updateFournisseur(Fournisseur fr);
	void deleteFournisseur(Fournisseur ar);
	void deleteFournisseurById(int codefr);
	Fournisseur getFournisseur(int codefr);
	List<Fournisseur> getAllFournisseurs();
}
