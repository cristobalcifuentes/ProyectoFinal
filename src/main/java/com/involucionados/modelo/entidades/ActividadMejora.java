package com.involucionados.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "MEJORAS")
public class ActividadMejora {
	
	@Column(name="ASESORIA_ID", nullable = false)
	private int idasesoria;
	
	@Id
	@GeneratedValue (generator="autoincrementoID")
	@SequenceGenerator (name="autoincrementoID", sequenceName="MEJORAS_SEQ", allocationSize=1)
	@Column(name="ID_1", nullable = false)
	private int id;
	
	@Column(name = "ESTADO_MEJORA_ID", nullable = false)
	private int idestadomejora;
	
	@Column(name = "DESCRIPCION", nullable = true, length = 80)
	private String descripcion;

	public ActividadMejora() {
	}

	public ActividadMejora(int idasesoria, int id, int idestadomejora, String descripcion) {
		this.idasesoria = idasesoria;
		this.id = id;
		this.idestadomejora = idestadomejora;
		this.descripcion = descripcion;
	}

	public int getIdasesoria() {
		return idasesoria;
	}

	public void setIdasesoria(int idasesoria) {
		this.idasesoria = idasesoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdestadomejora() {
		return idestadomejora;
	}

	public void setIdestadomejora(int idestadomejora) {
		this.idestadomejora = idestadomejora;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "ActividadMejora [idasesoria=" + idasesoria + ", id=" + id + ", idestadomejora=" + idestadomejora
				+ ", descripcion=" + descripcion + "]";
	}

}
