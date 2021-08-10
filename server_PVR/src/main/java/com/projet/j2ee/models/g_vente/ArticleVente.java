package com.projet.j2ee.models.g_vente;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name="g_vente.article")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class ArticleVente {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int codeArt;
	@Basic
	private String nomArt;
	@Basic
	private String descArt;

	@Basic
	private int prixArt;
	
	
	
	
	
	
}
