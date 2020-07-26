package com.involucionados.servicio.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.involucionados.modelo.entidades.ActividadMejora;
import com.involucionados.modelo.repositorios.ActividadMejoraRepositorio;
import com.involucionados.servicio.interfaces.IActividadMejora;



@Service
public class ActividadMejoraServicio implements IActividadMejora{
	
@Autowired ActividadMejoraRepositorio repo;
@Autowired EntityManager em;


@Override
public ActividadMejora obtenerActividadMejora(int id) {
	
	return em.find(ActividadMejora.class, id);
}

@Override
public List<ActividadMejora> listarActividadMejora() {
	
	return (List<ActividadMejora>) repo.findAll();
	}
@Override
public void agregarActividadMejora(ActividadMejora acme) {
	repo.save(acme);

	
}
@Override
public void eliminarActividadMejora(int id) {
	repo.deleteById(id);
	
}
@Override
public void editarActividadMejora(ActividadMejora acme) {
	repo.save(acme);
	
}

	
	
/*
 * public void save(ActividadMejora actividadmejora) {
 * repo.save(actividadmejora); }
 * 
 * public List<ActividadMejora> listAll() { return (List<ActividadMejora>)
 * repo.findAll(); }
 * 
 * public ActividadMejora get(Long id) { return repo.findById(id).get(); }
 * 
 * public void delete(Long id) { repo.deleteById(id); }
 * 
 * public List<ActividadMejora> search(String keyword) { return
 * repo.search(keyword); }
 */
	

}
