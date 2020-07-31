package com.involucionados.servicio.implementaciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.involucionados.modelo.entidades.Profesional;
import com.involucionados.modelo.repositorios.ProfesionalRepo;
import com.involucionados.servicio.interfaces.IProfesionalService;

@Service
public class ProfesionalService implements IProfesionalService{
	
	@Autowired
	ProfesionalRepo repo;

	@Override
	public Profesional obtenerProId(int rut) {
		return this.repo.getOne(rut);
	}

	@Override
	public List<Profesional> obtenerProfesionales() {
		return this.repo.findAll();
	}

	@Override
	public void saveProfesional(Profesional profesional) {
		this.repo.save(profesional);
		
	}

	@Override
	public void deleteProfesional(int rut) {
		 this.repo.deleteById(rut);
		
	}

	@Override
	public void editProfesional(Profesional p) {
		this.repo.save(p);
		
	}

}
