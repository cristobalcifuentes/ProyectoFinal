package com.involucionados.servicio.interfaces;

import java.util.List;


public interface IPagoService {
	
	public String comprobarDeuda(String rut);
	public List<String> obtnerDeudores();

}
