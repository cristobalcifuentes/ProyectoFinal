package com.involucionados.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Estado_Solicitud")
public class EstadoSolicitud {
	
	
	@Id
	@GeneratedValue(generator="autoincrementID") 
    @SequenceGenerator(name = "autoincrementID", sequenceName = "ESTADO_SOLICITUD_SEQ" ,allocationSize=1)
	
		@Column(name="ID")
		private int id;
	    @Column(name="ESTADO")
		private String estado;
		
		
		public EstadoSolicitud(int id, String estado) {
			this.id = id;
			this.estado = estado;
		}



		public EstadoSolicitud() {
			
			}


		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}





		public String getEstado() {
			return estado;
		}





		public void setEstado(String estado) {
			this.estado = estado;
		}





		@Override
		public String toString() {
			return "EstadoSolicitud [id=" + id + ", estado=" + estado + "]";
		}
		
		
		
}
