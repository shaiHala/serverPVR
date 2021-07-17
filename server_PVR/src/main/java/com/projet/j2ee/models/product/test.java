package com.projet.j2ee.models.product;

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
	
	@Id
	private int id;
	@Basic
    private int aa;
	@Basic
	private int test1;
	public test(int i, int j, int k) {
		id=i;
		aa=j;
		test1=k;
	}
	public test() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAa() {
		return aa;
	}
	public void setAa(int aa) {
		this.aa = aa;
	}
	public int getTest1() {
		return test1;
	}
	public void setTest1(int test1) {
		this.test1 = test1;
	}
	@Override
	public String toString() {
		return "test [id=" + id + ", aa=" + aa + ", test1=" + test1 + "]";
	}
	
}
