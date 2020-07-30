package com.involucionados.servicio.interfaces;

import java.util.List;
import com.involucionados.modelo.entidades.EstadoSolicitud;


public interface IEstadoSolicitud {
	
	
	EstadoSolicitud obtenerEstadoSolicitud(int id);
	List<EstadoSolicitud> listarEstadoSolicitud();
	void agregarEstadoSolicitud(EstadoSolicitud es);
	void eliminarEstadoSolicitud(int id);
	void editarEstadoSolicitud(EstadoSolicitud es);


}
