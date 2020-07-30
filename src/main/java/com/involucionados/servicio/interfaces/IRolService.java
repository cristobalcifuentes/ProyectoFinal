package com.involucionados.servicio.interfaces;

import java.util.List;

import com.involucionados.modelo.entidades.Rol;

public interface IRolService {
	
	
	public List<Rol> obtenerRoles();
	public Rol obtenerRol(int id);
	public void saveRol(Rol rol);
	public void deleteRol(int id);
	public void editRol(Rol rol);

}
