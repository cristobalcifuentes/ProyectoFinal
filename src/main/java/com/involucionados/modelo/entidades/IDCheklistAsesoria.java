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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + asesoria;
		result = prime * result + cheklist;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IDCheklistAsesoria other = (IDCheklistAsesoria) obj;
		if (asesoria != other.asesoria)
			return false;
		if (cheklist != other.cheklist)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	

}
