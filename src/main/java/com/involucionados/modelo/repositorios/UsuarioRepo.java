package com.involucionados.modelo.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.involucionados.modelo.entidades.Usuario;



@Repository
public interface UsuarioRepo extends JpaRepository<Usuario,Integer> {
	
	public Usuario findByLogin(String loggin);
	
	
	/*
	 * @Query("SELECT u FROM Usuario u WHERE u.login = ?1 and u.password = ?2")
	 * Usuario comprobarLogin(String usu, String pass);
	 */
	
	@Query(  value = "SELECT * FROM Usuario u WHERE u.login = ?1 and u.password = ?2", 
			  nativeQuery = true)
	Usuario comprobarLogin(String usu, String pass);
}
