package com.involucionados.modelo.entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CHEKLIST")
public class Cheklist {

	@Id
	@Column(name = "ID_1")
	@GeneratedValue(generator = "autoincrementChek")
	@SequenceGenerator(name = "autoincrementChek", sequenceName = "SEC_CHECK", allocationSize = 1)
	private int id;

	@Column(name = "CHEKLIST")
	private String chek;
/*
	@ManyToMany
	@JoinTable(name = "CHEKLIST_ASESORIA", 
	joinColumns =  @JoinColumn(name = "CHECKLIST_ID") ,
	inverseJoinColumns = @JoinColumn (name = "ASESORIA_ID") )
	private Set<Asesoria> asesoria;
*/

	
	/*	@ManyToMany
	@JoinTable(name = "tabla intermedia", 
	joinColumns =  @JoinColumn(name = "llave foranea de tabla intermedia que se relaciona con esta clase") ,
	inverseJoinColumns = @JoinColumn (name = "llave foranea de tabla intermedia que se relaciona con la otra clase") )
	private Set<Asesoria> asesoria;
	
	*/
	 
	public Cheklist() {
	}



	public Cheklist(int id) {
		this.id = id;
	}
	
	


/*
	public Cheklist(String chek, Set<Asesoria> asesoria) {
		this.chek = chek;
		this.asesoria = asesoria;
	}



	public Cheklist(int id, String chek, Set<Asesoria> asesoria) {
		this.id = id;
		this.chek = chek;
		this.asesoria = asesoria;
	}

*/


	public Cheklist(String chek) {
		this.chek = chek;
	}


	
	public Cheklist(int id, String chek) {
		this.id = id;
		this.chek = chek;
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getChek() {
		return chek;
	}



	public void setChek(String chek) {
		this.chek = chek;
	}



	@Override
	public String toString() {
		return "Cheklist [id=" + id + ", chek=" + chek + "]";
	}


/*
	public Set<Asesoria> getAsesoria() {
		return asesoria;
	}



	public void setAsesoria(Set<Asesoria> asesoria) {
		this.asesoria = asesoria;
	}

*/


	
	
	
	
	



}
