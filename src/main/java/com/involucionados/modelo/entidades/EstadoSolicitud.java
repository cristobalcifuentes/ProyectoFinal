package com.involucionados.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ESTADO_SOLICITUD")
public class EstadoSolicitud {

	
	
	
	@Id
	@Column(name="ID")
	
	private int id;
	
	
	@Column(name="ESTADO")
	private String estado;


	public EstadoSolicitud() {
	}


	public EstadoSolicitud(int id) {
		this.id = id;
	}


	public EstadoSolicitud(String estado) {
		this.estado = estado;
	}


	public EstadoSolicitud(int id, String estado) {
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
		return "EstadoSolicitud [id=" + id + ", estado=" + estado + "]";
	}
	
	
	
	
}
