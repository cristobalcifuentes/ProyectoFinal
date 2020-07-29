package com.involucionados.servicio.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.involucionados.modelo.entidades.SolicitudVisita;
import com.involucionados.modelo.repositorios.ISolicitudVisitaRepositorio;
import com.involucionados.servicio.interfaces.ISolicitudVisitaServicio;

@Service
public class SolicitudVisitaServicio implements ISolicitudVisitaServicio {

	
	@Autowired
	ISolicitudVisitaRepositorio solicitud;

	
	@Autowired 
	EntityManager em;
	
	
	@Override
	public SolicitudVisita obtenerSolicitud(int id) {
		
		return em.find(SolicitudVisita.class, id);
	}

	@Override
	public List<SolicitudVisita> listarSolicitud() {
		// TODO Auto-generated method stub
		return solicitud.findAll();
	}

	@Override
	public void agregarSolicitud(SolicitudVisita c) {
		solicitud.save(c);

	}

	@Override
	public void eliminarSolicitud(int id) {
		solicitud.deleteById(id);
	}

	@Override
	public void editarSolicitud(SolicitudVisita c) {
		solicitud.save(c);
		

	}

}
