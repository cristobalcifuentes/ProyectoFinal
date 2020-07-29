package com.involucionados.modelo.entidades;

import java.io.Serializable;

public class IDCheklistAsesoria implements Serializable {

	private static final long serialVersionUID = 1L;

	private int cheklist;
	private int asesoria;
	
	
	public IDCheklistAsesoria() {
	}


	public IDCheklistAsesoria(int cheklist, int asesoria) {
		this.cheklist = cheklist;
		this.asesoria = asesoria;
	}


	public int getCheklist() {
		return cheklist;
	}


	public void setCheklist(int cheklist) {
		this.cheklist = cheklist;
	}


	public int getAsesoria() {
		return asesoria;
	}


	public void setAsesoria(int asesoria) {
		this.asesoria = asesoria;
	}
	
	
	
	
	
	
	
	
	

}
