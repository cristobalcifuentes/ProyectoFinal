package com.involucionados.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Capacitacion {
	
	@Id
	//@GeneratedValue
	@GeneratedValue(generator="autoincrementID") 
	//@GeneratedValue(strategy=generationtype.AUTO)
	@SequenceGenerator(name="autoincrementID",sequenceName="SEC_CAPACITACION", allocationSize=1)
	private int id;
	
	private String capacitacion;
	

	public Capacitacion() {
	}


	public Capacitacion(int id) {
		this.id = id;
	}


	public Capacitacion(String capacitacion) {
		this.capacitacion = capacitacion;
	}


	public Capacitacion(int id, String capacitacion) {
		this.id = id;
		this.capacitacion = capacitacion;
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


	@Override
	public String toString() {
		return "capacitacion [id=" + id + ", capacitacion=" + capacitacion + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
