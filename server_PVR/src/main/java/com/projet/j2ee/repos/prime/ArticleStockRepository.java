package com.projet.j2ee.repos.prime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.j2ee.models.prime.ArticleStock;

public interface ArticleStockRepository extends JpaRepository<ArticleStock, Integer> {

}
