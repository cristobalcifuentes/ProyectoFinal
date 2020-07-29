package com.involucionados.modelo.entidades;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CHEKLIST")
public class Cheklist {

	@Id
	@Column(name = "ID_1")
	@GeneratedValue(generator = "autoincrementChek")
	@SequenceGenerator(name = "autoincrementChek", sequenceName = "SEC_CHECK", allocationSize = 1)
	private int id;

	@Column(name = "CHEKLIST")
	private String chek;
	
	
	@OneToMany(mappedBy="asesoria")
	private Set<CheklistAsesoria> asesoria;

	 
	public Cheklist() {
	}



	public Cheklist(int id) {
		this.id = id;
	}
	
	





	public Cheklist(String chek) {
		this.chek = chek;
	}


	
	public Cheklist(int id, String chek) {
		this.id = id;
		this.chek = chek;
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getChek() {
		return chek;
	}



	public void setChek(String chek) {
		this.chek = chek;
	}



	@Override
	public String toString() {
		return "Cheklist [id=" + id + ", chek=" + chek + "]";
	}




	
	
	
	
	



}
