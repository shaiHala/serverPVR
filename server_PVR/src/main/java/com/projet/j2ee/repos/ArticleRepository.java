package com.projet.j2ee.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.j2ee.models.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer > {

}
