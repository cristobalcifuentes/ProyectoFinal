package com.involucionados.servicio.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.involucionados.modelo.entidades.CheklistAsesoria;
import com.involucionados.modelo.entidades.IDCheklistAsesoria;
import com.involucionados.modelo.repositorios.ICheklistAsesoriaRepositorio;
import com.involucionados.servicio.interfaces.ICheklistAsesoriaServicio;

@Service
public class CheklistAsesoriaServicio implements ICheklistAsesoriaServicio {

	
	@Autowired
	ICheklistAsesoriaRepositorio cheklistAsesoria;
	
	@Autowired 
	EntityManager em;
	
	
	@Override
	public CheklistAsesoria obtenerCheklistAsesoria(IDCheklistAsesoria id) {
		// TODO Auto-generated method stub
		return em.find(CheklistAsesoria.class, id);
	}

	@Override
	public List<CheklistAsesoria> listarCheklistAsesoria() {
		
		return  cheklistAsesoria.findAll();
				
	}

	@Override
	public void agregarCheklistAsesoria(CheklistAsesoria c) {
		// TODO Auto-generated method stub

		cheklistAsesoria.save(c);
	}

	@Override
	public void eliminarCheklistAsesoria(IDCheklistAsesoria id) {
		// TODO Auto-generated method stub

		
		cheklistAsesoria.deleteById(id);
	}

	@Override
	public void editarCheklistAsesoria(CheklistAsesoria c) {
		// TODO Auto-generated method stub
		
		cheklistAsesoria.save(c);

	}

}
