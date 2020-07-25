package com.involucionados.modelo.entidades;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ASESORIA")
public class Asesoria {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(generator = "autoincrementAsesoria")
	@SequenceGenerator(name = "autoincrementAsesoria", sequenceName = "SEC_ASESORIAS", allocationSize = 1)
	private int id;
	
	@Column(name="VISITA_ID_1")
	private String Asesoria;
	
	
	
	@ManyToMany
	@JoinTable(name = "CHEKLIST_ASESORIA", 
	joinColumns =  @JoinColumn(name = "ASESORIA_ID") ,
	inverseJoinColumns = @JoinColumn (name = "CHECKLIST_ID") )
	private Set<Cheklist> chek;

	
	
	



	public Asesoria() {
	}


	public Asesoria(int id) {
		this.id = id;
	}


	public Asesoria(String asesoria, Set<Cheklist> chek) {
		Asesoria = asesoria;
		this.chek = chek;
	}


	public Asesoria(int id, String asesoria, Set<Cheklist> chek) {
		this.id = id;
		Asesoria = asesoria;
		this.chek = chek;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAsesoria() {
		return Asesoria;
	}


	public void setAsesoria(String asesoria) {
		Asesoria = asesoria;
	}


	public Set<Cheklist> getChek() {
		return chek;
	}


	public void setChek(Set<Cheklist> chek) {
		this.chek = chek;
	}


	@Override
	public String toString() {
		return "Asesoria [id=" + id + ", Asesoria=" + Asesoria + ", chek=" + chek + "]";
	}



	
	

}
