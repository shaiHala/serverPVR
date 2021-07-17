package com.projet.j2ee.repos.prime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.projet.j2ee.models.prime.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {

}
