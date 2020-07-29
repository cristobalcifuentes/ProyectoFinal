package com.involucionados.servicio.implementaciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.involucionados.modelo.entidades.Rol;
import com.involucionados.modelo.repositorios.RolRepo;
import com.involucionados.servicio.interfaces.IRolService;




@Service
public class RolService implements IRolService {
	
	@Autowired
	RolRepo repo;

	@Override
	public List<Rol> obtenerRoles() {
		return this.repo.findAll();
	}

	@Override
	public Rol obtenerRol(int id) {
		 return this.repo.getOne(id);
	}

	@Override
	public void saveRol(Rol rol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRol(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editRol(Rol rol) {
		// TODO Auto-generated method stub
		
	}



}
