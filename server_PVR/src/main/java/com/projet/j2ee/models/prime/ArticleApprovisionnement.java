package com.projet.j2ee.models.prime;
import java.io.Serializable;
import java.util.*;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table (name="g_stock.articles_approvisionnement")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class ArticleApprovisionnement  implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	@Basic
    private int qteCmd;
	@Basic
    private Date datePreLivrison;
	@ManyToOne(targetEntity = Article.class, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH })
	private Article article;
	public ArticleApprovisionnement(int id, int qteCmd, Date datePreLivrison, Article article) {
		super();
		this.id = id;
		this.qteCmd = qteCmd;
		this.datePreLivrison = datePreLivrison;
		this.article = article;
	}
    public ArticleApprovisionnement() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQteCmd() {
		return qteCmd;
	}
	public void setQteCmd(int qteCmd) {
		this.qteCmd = qteCmd;
	}
	public Date getDatePreLivrison() {
		return datePreLivrison;
	}
	public void setDatePreLivrison(Date datePreLivrison) {
		this.datePreLivrison = datePreLivrison;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	@Override
	public String toString() {
		return "ArticleApprovisionnement [id=" + id + ", qteCmd=" + qteCmd + ", datePreLivrison=" + datePreLivrison
				+ ", article=" + article + "]";
	}
    

}
