package com.involucionados.modelo.entidades;


import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="REPORTE_ACCIDENTE")
public class ReporteAccidente {
	

	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="FECHA")
	private String fecha;
	
	//bi-directional many-to-one association to Cliente
	@ManyToOne
	private Cliente cliente;

	//bi-directional many-to-one association to Trabajador
	@OneToMany(mappedBy="reporteAccidente", cascade = CascadeType.ALL)
	private List<Trabajador> trabajadors;

	public ReporteAccidente() {
	}
	
	

	public ReporteAccidente(int id, String fecha, Cliente cliente) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.cliente = cliente;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<Trabajador> getTrabajadors() {
		return this.trabajadors;
	}

	public void setTrabajadors(List<Trabajador> trabajadors) {
		this.trabajadors = trabajadors;
	}

	public Trabajador addTrabajador(Trabajador trabajador) {
		getTrabajadors().add(trabajador);
		trabajador.setReporteaccidente(this);

		return trabajador;
	}

	public Trabajador removeTrabajador(Trabajador trabajador) {
		getTrabajadors().remove(trabajador);
		trabajador.setReporteaccidente(null);

		return trabajador;
	}
}
