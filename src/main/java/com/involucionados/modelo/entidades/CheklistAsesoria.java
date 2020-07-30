package com.involucionados.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "CHEKLIST_ASESORIA")
@IdClass (IDCheklistAsesoria.class)  
public class CheklistAsesoria implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2636467066971111L;

	@Id
	@ManyToOne
	@JoinColumn(name="CHECKLIST_ID")
	private Cheklist cheklist;
	
	@Id
	@ManyToOne
	@JoinColumn(name="ASESORIA_ID")
	private Asesoria asesoria;
	
	
	@ManyToOne
	@JoinColumn(name="ESTADO_CHEKLIST_ID")
	private EstadoChek chek;


	public CheklistAsesoria() {
	}


	public CheklistAsesoria(Cheklist cheklist) {
		this.cheklist = cheklist;
	}


	public CheklistAsesoria(Asesoria asesoria, EstadoChek chek) {
		this.asesoria = asesoria;
		this.chek = chek;
	}


	public CheklistAsesoria(Cheklist cheklist, Asesoria asesoria, EstadoChek chek) {
		this.cheklist = cheklist;
		this.asesoria = asesoria;
		this.chek = chek;
	}


	public Cheklist getCheklist() {
		return cheklist;
	}


	public void setCheklist(Cheklist cheklist) {
		this.cheklist = cheklist;
	}


	public Asesoria getAsesoria() {
		return asesoria;
	}


	public void setAsesoria(Asesoria asesoria) {
		this.asesoria = asesoria;
	}


	public EstadoChek getChek() {
		return chek;
	}


	public void setChek(EstadoChek chek) {
		this.chek = chek;
	}


	@Override
	public String toString() {
		return "CheklistAsesoria [cheklist=" + cheklist + ", asesoria=" + asesoria + ", chek=" + chek + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
