package com.projet.j2ee.models.g_user;


import java.io.Serializable;
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
@Table (name = "g_user.user")
@Data @NoArgsConstructor @ToString 
@AllArgsConstructor 
public class User implements Serializable{

	   @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY )
	   private  int id_user;
       @Basic
	   private  String nomUser;
	   @Basic
	   private String userName;
	   @Basic
	   private String password;
	   @Basic
	   private String role;
}
