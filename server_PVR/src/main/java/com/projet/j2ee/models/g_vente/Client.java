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
@Table(name="g_vente.client")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Client {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	  private int idClt;
		@Basic
	   private String nomClt;
		@Basic
	   private String   adreessClt;
		@Basic
	   private String  contact;
		public Client(String nomClt, String adreessClt, String contact) {
			super();
			this.nomClt = nomClt;
			this.adreessClt = adreessClt;
			this.contact = contact;
		}
   
  
    
   
   
   
   
}
