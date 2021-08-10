package com.projet.j2ee.models.g_stock;
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
    private String statusCmd;
	@Basic
	private int prixArt;
	@Basic
    private String datePreLivrison;
	@ManyToOne(targetEntity = Article.class)
	private Article article;
	
	@ManyToOne(targetEntity = Fournisseur.class)
	private Fournisseur fr;
	
	

    

}
