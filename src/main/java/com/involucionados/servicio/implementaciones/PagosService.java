package com.involucionados.servicio.implementaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.involucionados.modelo.repositorios.PagoRepo;
import com.involucionados.servicio.interfaces.IPagoService;

@Service
public class PagosService implements IPagoService{
	
	@Autowired
	PagoRepo repo;
	@Override
	public String comprobarDeuda(String rut) {
		return this.repo.comprobarDeuda(rut);
	}
	
	

}
