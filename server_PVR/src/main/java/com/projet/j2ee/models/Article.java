package com.projet.j2ee.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table (name = "g_stock.article")
@Data @AllArgsConstructor @NoArgsConstructor @ToString 
public class Article implements Serializable {
	  @Id
	   private  int codeArt;
	  @Basic
	   private int prixArt;
	  @Basic
	   private  String nomArt;
	  @Basic
	   private String descArt;

}
