package com.involucionados.servicio.interfaces;

import java.util.List;

import com.involucionados.modelo.entidades.Profesional;

public interface IProfesionalService {
	
	public Profesional obtenerProId(int rut);
	public List<Profesional> obtenerProfesionales();
	public void saveProfesional(Profesional profesional);
	public void deleteProfesional(int rut);
	public void editProfesional(Profesional p);

}
