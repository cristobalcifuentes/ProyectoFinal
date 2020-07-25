package com.involucionados.servicio.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.involucionados.modelo.entidades.Cheklist;
import com.involucionados.modelo.repositorios.ICheklistRepositorio;
import com.involucionados.servicio.interfaces.ICheklistServicio;

@Service
public class CheklistServicio implements ICheklistServicio {

	
	@Autowired
	ICheklistRepositorio chekR;
	
	@Autowired 
	EntityManager em;
	
	
	
	@Override
	public Cheklist obtenerChek(int id) {
		
		return em.find(Cheklist.class, id) ;
	}

	@Override
	public List<Cheklist> listarCheklist() {
		
		return chekR.findAll();
	}

	@Override
	public void agregarCheklist(Cheklist c) {
		chekR.save(c);

	}

	@Override
	public void eliminarCheklist(int id) {
		chekR.deleteById(id);

	}

	@Override
	public void editarCheklist(Cheklist c) {
		chekR.save(c);

	}

}
