package com.involucionados.modelo.entidades;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "SOLICITUD_VISITA")
public class SolicitudVisita {
	
	
	
	@Id
	@Column(name="ID")
	@GeneratedValue(generator = "autoincrementSolicitud")
	@SequenceGenerator(name = "autoincrementSolicitud", sequenceName = "SEC_SOL_VISITA", allocationSize = 1)
	private int id;
	
	
	@ManyToOne
	@JoinColumn(name="ESTADO_SOLICITUD_ID")
	private EstadoSolicitud estado;
	
	@ManyToOne
	@JoinColumn(name="TIPO_ID")
	private TipoVisita tipo;
	
	
	@ManyToOne
	@JoinColumn(name="CLIENTE_RUT")
	private Cliente cliente;
	
	@OneToMany(mappedBy="solicitud")
	private List<Visita> visita;
	
	
	@Transient
	private Visita visitaAsociada;
	
	public Visita getVisitaAsociada() {
		return visitaAsociada;
	}


	public void setVisitaAsociada(Visita visitaAsociada) {
		this.visitaAsociada = visitaAsociada;
	}


	public List<Visita> getVisita() {
		return visita;
	}


	public void setVisita(List<Visita> visita) {
		this.visita = visita;
	}


	public SolicitudVisita() {
	}


	public SolicitudVisita(int id) {
		this.id = id;
	}


	public SolicitudVisita(EstadoSolicitud estado, TipoVisita tipo, Cliente cliente, Set<Visita> visitas) {
		this.estado = estado;
		this.tipo = tipo;
		this.cliente = cliente;
	}


	public SolicitudVisita(int id, EstadoSolicitud estado, TipoVisita tipo, Cliente cliente, Set<Visita> visitas) {
		this.id = id;
		this.estado = estado;
		this.tipo = tipo;
		this.cliente = cliente;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public EstadoSolicitud getEstado() {
		return estado;
	}


	public void setEstado(EstadoSolicitud estado) {
		this.estado = estado;
	}


	public TipoVisita getTipo() {
		return tipo;
	}


	public void setTipo(TipoVisita tipo) {
		this.tipo = tipo;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente rutCliente) {
		this.cliente = rutCliente;
	}


	@Override
	public String toString() {
		return "SolicitudVisita [id=" + id + ", estado=" + estado + ", tipo=" + tipo + ", cliente=" + cliente
				+ ", visitaAsociada=" + visitaAsociada + "]";
	}


	

	


	
	
	
	
	
	
}


	
