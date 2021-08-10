package com.projet.j2ee.models.g_stock;

import javax.persistence.Id;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name="g_stock.fournisseur")
@Data @NoArgsConstructor @AllArgsConstructor @ToString @Builder
public class Fournisseur  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int codeFr;
	@Column
    private String nomFr;
	@Column
    private String adresseFr;
	@Column
    private String contactFr;
	
	public Fournisseur(String nomFr, String adresseFr, String contactFr) {
		
		this.nomFr = nomFr;
		this.adresseFr = adresseFr;
		this.contactFr = contactFr;
	}
	public int getCodeFr() {
		return codeFr;
	}
	public void setCodeFr(int codeFr) {
		this.codeFr = codeFr;
	}
	public String getNomFr() {
		return nomFr;
	}
	public void setNomFr(String nomFr) {
		this.nomFr = nomFr;
	}
	public String getAdresseFr() {
		return adresseFr;
	}
	public void setAdresseFr(String adresseFr) {
		this.adresseFr = adresseFr;
	}
	public String getContactFr() {
		return contactFr;
	}
	public void setContactFr(String contactFr) {
		this.contactFr = contactFr;
	}

    
}
