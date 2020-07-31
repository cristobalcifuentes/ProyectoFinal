package com.involucionados.servicio.interfaces;

import java.util.List;

import com.involucionados.modelo.entidades.Cliente;

public interface IClienteService {
	
	public Cliente obtenerCliente(String id);
	public List<Cliente> obtenerCliente();
	public void saveUser(Cliente cliente);
	public void deleteCliente(String id);
	public void editCliente(Cliente c);

}
