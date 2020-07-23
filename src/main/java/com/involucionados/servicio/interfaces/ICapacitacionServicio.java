package com.involucionados.servicio.interfaces;

import java.util.List;


import com.involucionados.modelo.entidades.Capacitacion;


public interface ICapacitacionServicio {
	
	
	Capacitacion obtenerCapacitacion(int id);
	List<Capacitacion> listarCapacitacion();
	void agregarCapacitacion(Capacitacion c);
	void eliminarCapacitacion(int id);
	void editarCapacitacion(Capacitacion c);

}
