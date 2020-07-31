package com.involucionados.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PROFESIONAL")
public class Profesional {

	@Id
	@Column(name="RUT")
	private int rut;
	
	@JoinColumn(name = "USUARIO_ID")
	@OneToOne
	private Usuario usuario;
	
	@Column(name="PROFESION")
	private String profesion;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="SALUD")
	private String salud;

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

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSalud() {
		return salud;
	}

	public void setSalud(String salud) {
		this.salud = salud;
	}
	
	
}
