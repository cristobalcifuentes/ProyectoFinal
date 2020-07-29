package com.involucionados.servicio.implementaciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.involucionados.modelo.entidades.Cliente;
import com.involucionados.modelo.repositorios.ClienteRepo;
import com.involucionados.servicio.interfaces.IClienteService;



@Service
public class ClienteService  implements IClienteService{
	
	@Autowired
	ClienteRepo repo;

	@Override
	public Cliente obtenerCliente(String id) {
		return this.repo.getOne(id);
	}

	@Override
	public List<Cliente> obtenerCliente() {
		return this.repo.findAll();
	}

	@Override
	public void saveUser(Cliente cliente) {
		this.repo.save(cliente);
		
	}

	@Override
	public void deleteCliente(String id) {
		this.repo.deleteById(id);
		
	}

	@Override
	public void editCliente(Cliente c) {
		this.repo.save(c);
		
	}



}
