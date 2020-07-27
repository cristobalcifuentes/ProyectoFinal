package com.involucionados.servicio.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.involucionados.modelo.entidades.EstadoSolicitud;
import com.involucionados.modelo.repositorios.EstadoSolicitudRepositorio;
import com.involucionados.servicio.interfaces.IEstadoSolicitud;


public class EstadoSolicitudServicio implements IEstadoSolicitud {
	
	@Autowired
	EstadoSolicitudRepositorio EstadoSolicitud;
	
	@Autowired
	EntityManager est;

	@Override
	public EstadoSolicitud obtenerEstadoSolicitud(int id) {
		
		return est.find(EstadoSolicitud.class, id);
	}

	@Override
	public List<EstadoSolicitud> listarEstadoSolicitud() {
		
		return (List<EstadoSolicitud>) EstadoSolicitud.findAll();
	}

	@Override
	public void agregarEstadoSolicitud(EstadoSolicitud es) {
		EstadoSolicitud.save(es);
	
	}

	@Override
	public void eliminarEstadoSolicitud(int id) {
		EstadoSolicitud.deleteById(id);
		
	}

	@Override
	public void editarEstadoSolicitud(EstadoSolicitud es) {
		EstadoSolicitud.save(es);
		
	}
	
	

}
