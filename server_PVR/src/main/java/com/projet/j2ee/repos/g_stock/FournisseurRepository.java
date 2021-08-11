package com.projet.j2ee.repos.g_stock;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.j2ee.models.g_stock.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {

}
