package com.projet.j2ee.models;

import javax.persistence.Id;

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
@Table(name="g_stock.fournisseur")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Fournisseur  implements Serializable{
	@Id
	private int codeFr;
	@Basic
    private String nomFr;
	@Basic
    private String adresseFr;
	@Basic
    private String contactFr;
    
}
