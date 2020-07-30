package com.involucionados.modelo.entidades;


import javax.persistence.*;


@Entity
public class Administrador {
	
	@Id
	@Column(name="RUT")
	private int rut;
	

	@OneToOne
	@JoinColumn(name = "USUARIO_ID")
	private Usuario usuario;

	public Administrador() {
		super();
	}

	public Administrador(int rut, Usuario usuario) {
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
