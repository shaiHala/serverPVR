package com.projet.j2ee.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.j2ee.models.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {

}
