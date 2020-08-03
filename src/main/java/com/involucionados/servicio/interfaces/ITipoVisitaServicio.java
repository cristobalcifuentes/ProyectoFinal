package com.involucionados.servicio.interfaces;

import java.util.List;

import com.involucionados.modelo.entidades.TipoVisita;

public interface ITipoVisitaServicio {
	
	TipoVisita obtenerTipoVisita(int id);
	List<TipoVisita> listarTipoVisita();
	void agregaTipoVisita(TipoVisita v);
	void eliminarTipoVisita(int id);
	void editarTipoVisita(TipoVisita v);

}
