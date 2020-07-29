package com.involucionados.servicio.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.involucionados.modelo.entidades.Asesoria;
import com.involucionados.modelo.repositorios.IAsesoriaRepositorio;
import com.involucionados.servicio.interfaces.IAsesoriaServicio;

@Service
public class AsesoriaServicio implements IAsesoriaServicio {

	
	@Autowired
	IAsesoriaRepositorio asesoria; 
	
	
	@Autowired 
	EntityManager em;
	
	
	
	@Override
	public Asesoria obtenerAsesoria(int id) {
		// TODO Auto-generated method stub
		return em.find(Asesoria.class, id);
	}

	@Override
	public List<Asesoria> listarAsesoria() {
		System.out.println("llama a listar en servicio");
		return asesoria.findAll();
	}

	@Override
	public void agregarAsesoria(Asesoria a) {
		// TODO Auto-generated method stub
		
		asesoria.save(a);

	}

	@Override
	public void eliminarAsesoria(int id) {
		// TODO Auto-generated method stub

		
		asesoria.deleteById(id);
	}

	@Override
	public void editarAsesorian(Asesoria a) {
		// TODO Auto-generated method stub
		
		asesoria.save(a);

	}

}
