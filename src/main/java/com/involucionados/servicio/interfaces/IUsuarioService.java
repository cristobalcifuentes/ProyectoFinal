package com.involucionados.servicio.interfaces;

import java.util.List;

import com.involucionados.modelo.entidades.Usuario;



public interface IUsuarioService {
	
	public Usuario obtenerUsuario(int id);
	public List<Usuario> traerUsuarios();;
	public void saveUser(Usuario usuario);
	public void borrarUsuario(Integer id);
	public void editUsuario(Usuario usuario);
	public Usuario ComprobarLogin(String login,String pass);


}
