package com.involucionados.servicio.implementaciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.involucionados.modelo.entidades.ReporteAccidente;
import com.involucionados.modelo.repositorios.ReporteAccRepo;
import com.involucionados.servicio.interfaces.IReporteAccidenteService;

@Service
public class ReporteAccService implements IReporteAccidenteService{
	
	@Autowired
	ReporteAccRepo repo;
	

	@Override
	public void saveReporteAcc(ReporteAccidente reporte) {
			this.repo.save(reporte);
	}


	@Override
	public List<ReporteAccidente> listarAccidentes() {
		return this.repo.findAll();
	}

}
