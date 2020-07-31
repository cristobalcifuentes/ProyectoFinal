package com.involucionados.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="VISITA")
public class Visita {
	
	
	@Id
	@Column(name = "ID_1")
	@GeneratedValue(generator = "autoincrementVisita")
	@SequenceGenerator(name = "autoincrementVisita", sequenceName = "SEC_VISITA", allocationSize = 1)
	private int id;
	
	//modificar cuando este incluida la clase!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//especificar la relacion
	@ManyToOne
	@JoinColumn(name = "RUT_PROFESIONAL")
	private Profesional rutProfesional;
	
	
	@Column(name = "FECHA")
	private String fecha;
	
	
	@ManyToOne
	@JoinColumn(name="SOLICITUD_ID")
	private SolicitudVisita solicitud;
	
	
	//este recibe
	@OneToOne(mappedBy ="visita")
	private Asesoria asesoria;


	public Visita() {
	}


	public Visita(int id) {
		this.id = id;
	}


	public Visita(Profesional rutProfesional, String fecha, SolicitudVisita solicitud) {
		this.rutProfesional = rutProfesional;
		this.fecha = fecha;
		this.solicitud = solicitud;
	}


	public Visita(int id, Profesional rutProfesional, String fecha, SolicitudVisita solicitud, Asesoria asesoria) {
		this.id = id;
		this.rutProfesional = rutProfesional;
		this.fecha = fecha;
		this.solicitud = solicitud;
		this.asesoria = asesoria;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Profesional getRutProfesional() {
		return rutProfesional;
	}


	public void setRutProfesional(Profesional rutProfesional) {
		this.rutProfesional = rutProfesional;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public SolicitudVisita getSolicitud() {
		return solicitud;
	}


	public void setSolicitud(SolicitudVisita solicitud) {
		this.solicitud = solicitud;
	}


	public Asesoria getAsesoria() {
		return asesoria;
	}


	public void setAsesoria(Asesoria asesoria) {
		this.asesoria = asesoria;
	}


	@Override
	public String toString() {
		return "Visita [id=" + id + ", rutProfesional=" + rutProfesional + ", fecha=" + fecha + ", solicitud="
				+ solicitud + ", asesoria=" + asesoria + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
