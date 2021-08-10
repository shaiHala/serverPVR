package com.projet.j2ee.models.g_stock;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name = "g_stock.article")
@Data @NoArgsConstructor @ToString 
@AllArgsConstructor 
public class Article   implements Serializable {
	 
	
	@Id
	   private  int codeArt;
	 
	@Basic
	   private  String nomArt;
	  @Basic
	   private String descArt;

}
