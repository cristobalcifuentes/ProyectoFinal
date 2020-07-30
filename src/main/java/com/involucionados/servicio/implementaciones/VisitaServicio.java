package com.involucionados.servicio.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.involucionados.modelo.entidades.Visita;
import com.involucionados.modelo.repositorios.IVisitaRepositorio;
import com.involucionados.servicio.interfaces.IVisitaServicio;

@Service
public class VisitaServicio implements IVisitaServicio {
	
	
	@Autowired
	IVisitaRepositorio visita;
	
	@Autowired 
	EntityManager em;

	@Override
	public Visita obtenerVisita(int id) {
		// TODO Auto-generated method stub
		return em.find(Visita.class, id);
	}

	@Override
	public List<Visita> listarVisita() {
		// TODO Auto-generated method stub
		return visita.findAll();
	}

	@Override
	public void agregarVisita(Visita v) {
		visita.save(v);

	}

	@Override
	public void eliminarVisita(int id) {
		visita.deleteById(id);

	}

	@Override
	public void editarVisita(Visita v) {
		
		visita.save(v);
	}

}
