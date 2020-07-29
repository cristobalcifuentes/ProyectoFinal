package com.involucionados.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TIPO_VISITA")
public class TipoVisita {
	
	@Id
	@Column(name="ID")
	private int id;
	
	
	@Column(name="TIPO")
	private String tipoVisita;


	public TipoVisita() {
	}


	public TipoVisita(int id) {
		this.id = id;
	}


	public TipoVisita(String tipoVisita) {
		this.tipoVisita = tipoVisita;
	}


	public TipoVisita(int id, String tipoVisita) {
		this.id = id;
		this.tipoVisita = tipoVisita;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTipoVisita() {
		return tipoVisita;
	}


	public void setTipoVisita(String tipoVisita) {
		this.tipoVisita = tipoVisita;
	}


	@Override
	public String toString() {
		return "TipoVisita [id=" + id + ", tipoVisita=" + tipoVisita + "]";
	}
	
	
	
	
	
	
	
	

}
