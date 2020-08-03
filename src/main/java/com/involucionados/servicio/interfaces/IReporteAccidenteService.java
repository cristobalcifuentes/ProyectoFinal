package com.involucionados.servicio.interfaces;

import java.util.List;

import com.involucionados.modelo.entidades.ReporteAccidente;

public interface IReporteAccidenteService {
	
	public void saveReporteAcc(ReporteAccidente reporte);
	List<ReporteAccidente> listarAccidentes();

}
