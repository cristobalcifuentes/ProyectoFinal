package com.involucionados.servicio.interfaces;

import java.util.List;


import com.involucionados.modelo.entidades.Visita;

public interface IVisitaServicio {
	
	
	
	
	Visita obtenerVisita(int id);
	List<Visita> listarVisita();
	void agregarVisita(Visita c);
	void eliminarVisita(int id);
	void editarVisita(Visita c);

}
