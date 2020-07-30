package com.involucionados.modelo.entidades;

import java.util.List;

import javax.persistence.*;



@Entity
@Table(name="ESTADO_PAGO")
public class EstadoPago {

	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="ESTADO_PAGO")
	private String estadoPago;
	
	@OneToMany(mappedBy="estadoPago")
	private List<Pagos> pagos;

	public EstadoPago() {
		super();
	}

	public EstadoPago(int id, String estadoPago, List<Pagos> pagos) {
		super();
		this.id = id;
		this.estadoPago = estadoPago;
		this.pagos = pagos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstadoPago() {
		return estadoPago;
	}

	public void setEstadoPago(String estadoPago) {
		this.estadoPago = estadoPago;
	}

	public List<Pagos> getPagos() {
		return pagos;
	}

	public void setPagos(List<Pagos> pagos) {
		this.pagos = pagos;
	}
	
	public Pagos addPago(Pagos pago) {
		getPagos().add(pago);
		pago.setEstadoPago(this);

		return pago;
	}

	public Pagos removePago(Pagos pago) {
		getPagos().remove(pago);
		pago.setEstadoPago(null);

		return pago;
	}
	
	
}
