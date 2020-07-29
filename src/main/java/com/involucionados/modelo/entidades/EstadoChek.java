package com.involucionados.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ESTADO_CHEKLIST")
public class EstadoChek {
	
	
	@Id
	@Column(name="ID")
	private int id;
	
	
	@Column(name="ESTADO")
	private String estado;


	public EstadoChek() {
	}


	public EstadoChek(int id) {
		this.id = id;
	}


	public EstadoChek(String estado) {
		this.estado = estado;
	}


	public EstadoChek(int id, String estado) {
		this.id = id;
		this.estado = estado;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "EstadoChek [id=" + id + ", estado=" + estado + "]";
	}
	
	
	
	
	
	

}
