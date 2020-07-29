package com.involucionados.servicio.interfaces;

import java.util.List;

import com.involucionados.modelo.entidades.Asesoria;

public interface IAsesoriaServicio {
	
	
	Asesoria obtenerAsesoria(int id);
	List<Asesoria> listarAsesoria();
	void agregarAsesoria(Asesoria a);
	void eliminarAsesoria(int id);
	void editarAsesorian(Asesoria a);

}
