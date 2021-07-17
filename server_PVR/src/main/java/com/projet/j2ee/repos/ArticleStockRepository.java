package com.projet.j2ee.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.j2ee.models.ArticleStock;

public interface ArticleStockRepository extends JpaRepository<ArticleStock, Integer> {

}
