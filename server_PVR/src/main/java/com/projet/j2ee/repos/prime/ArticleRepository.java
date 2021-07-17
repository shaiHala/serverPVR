package com.projet.j2ee.repos.prime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.j2ee.models.prime.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer > {

}
