package com.involucionados.modelo.entidades;

import javax.persistence.*;


@Entity
@Table(name="PAGOS")
public class Pagos{

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "Sec-Pag")
    @SequenceGenerator(name = "Sec-Pag", sequenceName = "SEC_PAGOS" ,allocationSize=1)
	@Column(name="ID_1")
	private int id1;
	
	//bi-direccion many-to-one asociado a Cliente
	@ManyToOne
	private Cliente cliente;

	//bi-direccion many-to-one asociado a EstadoPago
	
	@ManyToOne
	@JoinColumn(name="ESTADO_PAGO_ID") 
	private EstadoPago estadoPago;
							
	public Pagos() {
		super();
	}

	public Pagos(Cliente cliente, EstadoPago estadoPago) {
		this.cliente = cliente;
		this.estadoPago = estadoPago;
	}

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public EstadoPago getEstadoPago() {
		return estadoPago;
	}

	public void setEstadoPago(EstadoPago estadoPago) {
		this.estadoPago = estadoPago;
	}
	
	
	

}
