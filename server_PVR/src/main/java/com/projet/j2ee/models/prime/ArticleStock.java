package com.projet.j2ee.models.prime;

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
	public ArticleStock( int prixArt, int qte, Article article) {
		super();
		this.prixArt = prixArt;
		this.qte = qte;
		this.article = article;
	}
	public ArticleStock() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrixArt() {
		return prixArt;
	}
	public void setPrixArt(int prixArt) {
		this.prixArt = prixArt;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	@Override
	public String toString() {
		return "ArticleStock [id=" + id + ", prixArt=" + prixArt + ", qte=" + qte + ", article=" + article + "]";
	}
	
	
   
}
