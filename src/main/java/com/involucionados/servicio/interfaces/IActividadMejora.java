package com.involucionados.servicio.interfaces;

import java.util.List;

import com.involucionados.modelo.entidades.ActividadMejora;

public interface IActividadMejora {
	
	ActividadMejora obtenerActividadMejora(int id);
	List<ActividadMejora> listarActividadMejora();
	void agregarActividadMejora (ActividadMejora acme);
	void eliminarActividadMejora (int id);
	void editarActividadMejora(ActividadMejora acme);

}
