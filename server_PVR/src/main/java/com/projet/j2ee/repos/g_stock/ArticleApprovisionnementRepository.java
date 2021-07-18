package com.projet.j2ee.repos.g_stock;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.j2ee.models.g_stock.ArticleApprovisionnement;

public interface ArticleApprovisionnementRepository extends JpaRepository<ArticleApprovisionnement, Integer> {

}
