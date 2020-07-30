package com.involucionados.servicio.interfaces;

import java.util.List;


import com.involucionados.modelo.entidades.CheklistAsesoria;
import com.involucionados.modelo.entidades.IDCheklistAsesoria;

public interface ICheklistAsesoriaServicio {
	
	
	
	CheklistAsesoria obtenerCheklistAsesoria(IDCheklistAsesoria id);
	List<CheklistAsesoria> listarCheklistAsesoria();
	void agregarCheklistAsesoria(CheklistAsesoria c);
	void eliminarCheklistAsesoria(IDCheklistAsesoria id);
	void editarCheklistAsesoria(CheklistAsesoria c);

}
