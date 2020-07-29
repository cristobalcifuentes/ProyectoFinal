package com.involucionados.modelo.entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="Usuario")
public class Usuario {
	

	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "Sec-Usu")
    @SequenceGenerator(name = "Sec-Usu", sequenceName = "SEC_USUARIO" ,allocationSize=1)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="rol_id")
	private Rol rol;
	
	@Column(name = "NOMBRE", length = 20)
	private String nombre;
	
	@Column(name = "APELLIDO", length = 20)
	private String apellido;
	
	@Column(name = "PASSWORD", length = 20)
	private String password;
	
	@Column(name = "LOGIN", length = 20)
	private String login;
	
	@OneToOne(mappedBy="usuario")
	private Cliente cliente;
	
	public Usuario() {
		super();
	}

	public Usuario(Rol rol, String nombre, String apellido, String password, String login) {
		this.rol = rol;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.login = login;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
	
}
