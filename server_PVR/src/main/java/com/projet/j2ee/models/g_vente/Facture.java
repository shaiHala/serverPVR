package com.projet.j2ee.models.g_vente;

import java.util.Date;

import javax.persistence.Basic;
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
@Table(name="g_vente.facture")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Facture {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int codeFct;
	@Basic
	private Date dateFct;
	@Basic
	private int totalFct;
	@Basic
	private int remiseFct;
	@ManyToOne
	private Client Clt;
	@ManyToOne 
	private Commande Cmd;
	private String modeRglt;
	private int resteFct;
	
	

}
