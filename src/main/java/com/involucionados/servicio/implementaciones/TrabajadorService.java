package com.involucionados.servicio.implementaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.involucionados.modelo.entidades.Trabajador;
import com.involucionados.modelo.repositorios.TrabajadorRepo;
import com.involucionados.servicio.interfaces.ITrabajadorService;

@Service
public class TrabajadorService implements ITrabajadorService{
	
	@Autowired
	TrabajadorRepo repo;

	@Override
	public void saveTrabajador(Trabajador trabajador) {
		this.repo.save(trabajador);
	}

	
}
