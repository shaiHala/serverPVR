package com.projet.j2ee.models;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table (name="g_stock.article_stock")

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class ArticleStock  implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	@Basic
    private int prixArt;
	@Basic
    private int qte;
	@ManyToOne(targetEntity = Article.class, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH })
	private Article article;
	
   
}
