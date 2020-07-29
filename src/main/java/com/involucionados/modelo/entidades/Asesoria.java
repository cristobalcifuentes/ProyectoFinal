package com.involucionados.modelo.entidades;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
		
	/**
	 * 
	 * 
	 * revisar
	 */
	
	@OneToMany(mappedBy="cheklist")
	private Set<CheklistAsesoria> cheklist;
	
	
	//este especifica
	@OneToOne
	@JoinColumn(name="VISITA_ID_1")
	private Visita visita;
	
	@OneToMany(mappedBy="idasesoria")
	private Set<ActividadMejora> mejoras;

	
	
	public Asesoria() {
	}



	public Asesoria(int id) {
		this.id = id;
	}
	
	



	public Asesoria(Visita visita) {
		this.visita = visita;
	}



	public Asesoria(Set<CheklistAsesoria> cheklist, Visita visita, Set<ActividadMejora> mejoras) {
		this.cheklist = cheklist;
		this.visita = visita;
		this.mejoras = mejoras;
	}



	public Asesoria(int id, Set<CheklistAsesoria> cheklist, Visita visita, Set<ActividadMejora> mejoras) {
		this.id = id;
		this.cheklist = cheklist;
		this.visita = visita;
		this.mejoras = mejoras;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Set<CheklistAsesoria> getCheklist() {
		return cheklist;
	}



	public void setCheklist(Set<CheklistAsesoria> cheklist) {
		this.cheklist = cheklist;
	}



	public Visita getVisita() {
		return visita;
	}



	public void setVisita(Visita visita) {
		this.visita = visita;
	}



	public Set<ActividadMejora> getMejoras() {
		return mejoras;
	}



	public void setMejoras(Set<ActividadMejora> mejoras) {
		this.mejoras = mejoras;
	}



	@Override
	public String toString() {
		return "Asesoria [id=" + id + ", IDvisita=" + visita.getId() + "]";
	}









	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
