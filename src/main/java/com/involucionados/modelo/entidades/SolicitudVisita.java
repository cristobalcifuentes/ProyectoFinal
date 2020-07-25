package com.involucionados.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SOLICITUD_VISITA")
public class SolicitudVisita {
	
	
	
	@Id
	@Column(name="ID")
	@GeneratedValue(generator = "autoincrementSolicitudolicitud")
	@SequenceGenerator(name = "autoincrementSolicitud", sequenceName = "SEC_SOL_VISITA", allocationSize = 1)
	private int id;
	
	
	@Column(name="ESTADO_SOLICITUD_ID")
	private int estadoSolicitud;
	
	
	@Column(name="TIPO_ID")
	private int tipoSolicitud;
	
	
	@Column(name="CLIENTE_RUT")
	private String rutCliente;


	public SolicitudVisita() {
	}


	public SolicitudVisita(int id) {
		this.id = id;
	}


	public SolicitudVisita(int estadoSolicitud, int tipoSolicitud, String rutCliente) {
		this.estadoSolicitud = estadoSolicitud;
		this.tipoSolicitud = tipoSolicitud;
		this.rutCliente = rutCliente;
	}


	public SolicitudVisita(int id, int estadoSolicitud, int tipoSolicitud, String rutCliente) {
		this.id = id;
		this.estadoSolicitud = estadoSolicitud;
		this.tipoSolicitud = tipoSolicitud;
		this.rutCliente = rutCliente;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getEstadoSolicitud() {
		return estadoSolicitud;
	}


	public void setEstadoSolicitud(int estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}


	public int getTipoSolicitud() {
		return tipoSolicitud;
	}


	public void setTipoSolicitud(int tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}


	public String getRutCliente() {
		return rutCliente;
	}


	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}


	@Override
	public String toString() {
		return "SolicitudVisita [id=" + id + ", estadoSolicitud=" + estadoSolicitud + ", tipoSolicitud=" + tipoSolicitud
				+ ", rutCliente=" + rutCliente + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
