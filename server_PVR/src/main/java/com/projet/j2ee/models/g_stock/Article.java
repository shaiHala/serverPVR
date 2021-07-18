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
	   private int prixArt;
	 
	@Basic
	   private  String nomArt;
	  @Basic
	   private String descArt;
	  public Article(int codeArt, int prixArt, String nomArt, String descArt) {
			this.codeArt = codeArt;
			this.prixArt = prixArt;
			this.nomArt = nomArt;
			this.descArt = descArt;
		}
	  public Article() {}
	public int getCodeArt() {
		return codeArt;
	}
	public void setCodeArt(int codeArt) {
		this.codeArt = codeArt;
	}
	public int getPrixArt() {
		return prixArt;
	}
	public void setPrixArt(int prixArt) {
		this.prixArt = prixArt;
	}
	public String getNomArt() {
		return nomArt;
	}
	public void setNomArt(String nomArt) {
		this.nomArt = nomArt;
	}
	public String getDescArt() {
		return descArt;
	}
	public void setDescArt(String descArt) {
		this.descArt = descArt;
	}
	@Override
	public String toString() {
		return "Article [codeArt=" + codeArt + ", prixArt=" + prixArt + ", nomArt=" + nomArt + ", descArt=" + descArt
				+ "]";
	}
	  
	  
}
