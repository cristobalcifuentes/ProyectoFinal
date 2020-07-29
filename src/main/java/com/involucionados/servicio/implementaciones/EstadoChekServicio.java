package com.involucionados.servicio.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.involucionados.modelo.entidades.EstadoChek;
import com.involucionados.modelo.repositorios.IEstadoChekRepositorio;
import com.involucionados.servicio.interfaces.IEstadoChekServicio;

@Service
public class EstadoChekServicio implements IEstadoChekServicio {

	
	@Autowired
	IEstadoChekRepositorio estado;
	
	@Autowired 
	EntityManager em;
	
	
	@Override
	public EstadoChek obtenerEstadoChek(int id) {
		// TODO Auto-generated method stub
		return em.find(EstadoChek.class, id);
	}

	@Override
	public List<EstadoChek> listarEstadoChek() {
		// TODO Auto-generated method stub
		return estado.findAll();
	}

	@Override
	public void agregarEstadoChek(EstadoChek e) {
		// TODO Auto-generated method stub
		
		estado.save(e);

	}

	@Override
	public void eliminarEstadoChek(int id) {
		// TODO Auto-generated method stub

		estado.deleteById(id);
	}

	@Override
	public void editarEstadoChek(EstadoChek e) {
		// TODO Auto-generated method stub
		
		estado.save(e);

	}

}
