package com.involucionados.servicio.interfaces;

import java.util.List;


import com.involucionados.modelo.entidades.Cheklist;

public interface ICheklistServicio {
	
	
	Cheklist obtenerChek(int id);
	List<Cheklist> listarCheklist();
	void agregarCheklist(Cheklist c);
	void eliminarCheklist(int id);
	void editarCheklist(Cheklist c);

}
