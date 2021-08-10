package com.projet.j2ee.models.g_vente;
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
@Table(name="g_vente.ligne_Cmd")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class LigneCmd{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int codeLigneCmd;
	
	@ManyToOne
	private Client Clt;
	@ManyToOne 
	private Commande Cmd;


}