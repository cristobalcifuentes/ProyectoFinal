package com.involucionados.servicio.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.involucionados.modelo.entidades.Capacitacion;
import com.involucionados.modelo.repositorios.ICapacitacionRepositorio;
import com.involucionados.servicio.interfaces.ICapacitacionServicio;

@Service
public class CapacitacionServicio implements ICapacitacionServicio {
	
	@Autowired
	ICapacitacionRepositorio capacitacion;
	
	@Autowired 
	EntityManager em;
	
	
	@Override
	public Capacitacion obtenerCapacitacion(int id) {
		
		//return null;
		//return capacitacion.findById(id);
		return em.find(Capacitacion.class, id);
		
	}

	@Override
	public List<Capacitacion> listarCapacitacion() {
		return (List<Capacitacion>) capacitacion.findAll();
	}

	@Override
	public void agregarCapacitacion(Capacitacion c) {
		capacitacion.save(c);

	}

	@Override
	public void eliminarCapacitacion(int id) {
		capacitacion.deleteById(id);

	}

	@Override
	public void editarCapacitacion(Capacitacion c) {
		capacitacion.save(c);

	}

}
