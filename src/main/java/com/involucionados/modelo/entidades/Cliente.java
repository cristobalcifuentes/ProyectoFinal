package com.involucionados.modelo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="CLIENTE")
public class Cliente {
	
	@Id
	@Column(name="RUT" , length =12)
	private String rut;
	
	@Column(name = "RAZON_SOCIAL", length = 100)
	private String razonsocial;
	
	@Column(name = "DIRECCION", length = 100)
	private String direccion;
	
	@Column(name = "COMUNA", length = 100)
	private String comuna;
	
	@Column(name = "TELEFONO", length = 38)
	private int telefono;
	
	@Column(name = "ACTIDAD_ECONOMICA", length = 100)
	private String actividadEco;
	
	@Column(name = "TIPO_DE_EMPRESA", length = 100)
	private String tipEmpresa;
	
	@OneToOne
	@JoinColumn(name="USUARIO_ID")
	private Usuario usuario;
	
	@Column(name = "EMA_CLI", length = 30)
	private String email;
	
	//bi-direccion many-to-one asociado a Pago
	@OneToMany(mappedBy="cliente")
	private List<Pagos> pagos;

	
	//bi-direccion many-to-one asociado a ReporteAccidente
	  
	@OneToMany(mappedBy="cliente") private List<ReporteAccidente>
	reporteAccidentes;
	  
	//bi-direccion many-to-one asociado a to SolicitudVisita
	  
	/*
	 * @OneToMany(mappedBy="cliente") private List<SolicitudVisita>
	 * solicitudVisitas;
	 */
	 

	public Cliente() {
		super();
	}

	public Cliente(String rut, String razonsocial, String direccion, String comuna, int telefono, String actividadEco,
			String tipEmpresa, Usuario usuario,String email) {
		super();
		this.rut = rut;
		this.razonsocial = razonsocial;
		this.direccion = direccion;
		this.comuna = comuna;
		this.telefono = telefono;
		this.actividadEco = actividadEco;
		this.tipEmpresa = tipEmpresa;
		this.usuario = usuario;
		this.email = email;
	}



	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getActividadEco() {
		return actividadEco;
	}

	public void setActividadEco(String actividadEco) {
		this.actividadEco = actividadEco;
	}

	public String getTipEmpresa() {
		return tipEmpresa;
	}

	public void setTipEmpresa(String tipEmpresa) {
		this.tipEmpresa = tipEmpresa;
	}
	public List<Pagos> getPagos() {
		return pagos;
	}

	public void setPagos(List<Pagos> pagos) {
		this.pagos = pagos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	  public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<ReporteAccidente> getReporteAccidentes() { return
	  reporteAccidentes; }
	  
	  public void setReporteAccidentes(List<ReporteAccidente> reporteAccidentes) {
	  this.reporteAccidentes = reporteAccidentes; }

	  
	/*
	 * public List<SolicitudVisita> getSolicitudVisitas() { return solicitudVisitas;
	 * }
	 * 
	 * public void setSolicitudVisitas(List<SolicitudVisita> solicitudVisitas) {
	 * this.solicitudVisitas = solicitudVisitas; }
	 */

	
	
	
	

}
