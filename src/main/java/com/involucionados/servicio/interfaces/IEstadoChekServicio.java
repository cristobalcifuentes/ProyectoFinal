package com.involucionados.servicio.interfaces;

import java.util.List;


import com.involucionados.modelo.entidades.EstadoChek;

public interface IEstadoChekServicio {

	
	EstadoChek obtenerEstadoChek(int id);
	List<EstadoChek> listarEstadoChek();
	void agregarEstadoChek(EstadoChek e);
	void eliminarEstadoChek(int id);
	void editarEstadoChek(EstadoChek e);
}
