package com.involucionados.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Capacitacion {
	
	@Id
	//@GeneratedValue
	@GeneratedValue(generator="autoincrementCapacitacion") 
	//@GeneratedValue(strategy=generationtype.AUTO)
	@SequenceGenerator(name="autoincrementCapacitacion",sequenceName="SEC_CAPACITACION", allocationSize=1)
	private int id;
	
	private String capacitacion;
	
	private String contenido;

	
	public Capacitacion() {
	}


	public Capacitacion(int id) {
		this.id = id;
	}


	public Capacitacion(String capacitacion, String contenido) {
		this.capacitacion = capacitacion;
		this.contenido = contenido;
	}


	public Capacitacion(int id, String capacitacion, String contenido) {
		this.id = id;
		this.capacitacion = capacitacion;
		this.contenido = contenido;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCapacitacion() {
		return capacitacion;
	}


	public void setCapacitacion(String capacitacion) {
		this.capacitacion = capacitacion;
	}


	public String getContenido() {
		return contenido;
	}


	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", capacitacion=" + capacitacion + ", contenido=" + contenido + "]";
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
