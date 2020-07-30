package com.involucionados.servicio.interfaces;

import java.util.List;

import com.involucionados.modelo.entidades.SolicitudVisita;

public interface ISolicitudVisitaServicio {
	
	SolicitudVisita obtenerSolicitud(int id);
	List<SolicitudVisita> listarSolicitud();
	void agregarSolicitud(SolicitudVisita c);
	void eliminarSolicitud(int id);
	void editarSolicitud(SolicitudVisita c);

}
