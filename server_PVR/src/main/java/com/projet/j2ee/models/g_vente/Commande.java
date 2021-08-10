package com.projet.j2ee.models.g_vente;

import java.util.Date;

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
@Table(name="g_vente.commande")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Commande {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int codeCmd;
	@Basic
	private int   qteCmd;
	@Basic
	private Date   dateCmd;
	@Basic
	private String  etatCmd;
	@Basic
	private int     idClt;

	
	
}
