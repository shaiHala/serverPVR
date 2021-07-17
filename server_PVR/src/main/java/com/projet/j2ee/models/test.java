package com.projet.j2ee.models;

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
@Table (name="g_vente.test1")

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class test {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	@Basic
    private int aa;
	@Basic
	private int test1;
}
