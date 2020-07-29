package com.involucionados.modelo.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




@Entity
@Table(name="Rol")
public class Rol {
	
	@Id
	@GeneratedValue(generator="autoincrementID")
	@SequenceGenerator(name="autoincrementID",sequenceName="SEC_ROL", allocationSize=1)
	@Column(name="ID")
	private int id;
	
	@Column(name="ROL")
	private String rol;
	
	@OneToMany(mappedBy="rol")
	private List<Usuario> usuarios;

	public Rol() {
		super();
	}

	public Rol(int id, String rol) {
		super();
		this.id = id;
		this.rol = rol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
}
