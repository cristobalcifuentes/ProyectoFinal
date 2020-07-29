package com.involucionados.modelo.entidades;


import javax.persistence.*;


@Entity
@Table(name="TRABAJADOR")
public class Trabajador {
	
	@Id
	@Column(name="RUT")
	private String rut;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="DIRECCION")
	private String direccion;
	
	@Column(name="COMUNA")
	private String comuna;
	
	@Column(name="TELEFONO")
	private int telefono;
	
	@Column(name="SEXO")
	private String sexo;
	
	
	//bi-directional many-to-one association to ReporteAccidente
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="REP_ID")
	private ReporteAccidente reporteAccidente;

	public Trabajador() {
		super();
	}
	
	
	public Trabajador(String rut, String nombre, String direccion, String comuna, int telefono, String sexo,
			ReporteAccidente reporteAccidente) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.direccion = direccion;
		this.comuna = comuna;
		this.telefono = telefono;
		this.sexo = sexo;
		this.reporteAccidente = reporteAccidente;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getComuna() {
		return comuna;
	}


	public void setComuna(String comuna) {
		this.comuna = comuna;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public ReporteAccidente getReporteaccidente() {
		return reporteAccidente;
	}


	public void setReporteaccidente(ReporteAccidente reporteaccidente) {
		this.reporteAccidente = reporteaccidente;
	}


	
	
	
	
	
}
