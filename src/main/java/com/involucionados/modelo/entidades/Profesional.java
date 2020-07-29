package com.involucionados.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Profesional {

	@Id
	@Column(name="RUT")
	private int rut;
	
	@JoinColumn(name = "USUARIO_ID")
	@OneToOne
	private Usuario usuario;

	public Profesional() {
		super();
	}

	public Profesional(int rut, Usuario usuario) {
		super();
		this.rut = rut;
		this.usuario = usuario;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
