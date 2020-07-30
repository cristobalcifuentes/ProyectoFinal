package com.involucionados.servicio.implementaciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.involucionados.modelo.entidades.Usuario;
import com.involucionados.modelo.repositorios.UsuarioRepo;
import com.involucionados.servicio.interfaces.IUsuarioService;



@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	UsuarioRepo repo;
	
	@Override
	public Usuario obtenerUsuario(int id) {
		return this.repo.getOne(id);
	}

	@Override
	public List<Usuario> traerUsuarios() {
		return this.repo.findAll();
	}

	@Override
	public void saveUser(Usuario usuario) {
		 this.repo.save(usuario);
	}

	@Override
	public void borrarUsuario(Integer id) {
		this.repo.deleteById(id);
	}

	@Override
	public void editUsuario(Usuario usuario) {
		this.repo.save(usuario);
		
	}

	@Override
	public Usuario ComprobarLogin(String login, String pass) {
		return this.repo.comprobarLogin(login, pass);
	}


		
}
	

