package com.involucionados.modelo.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.involucionados.modelo.entidades.Cliente;
import com.involucionados.modelo.entidades.Usuario;



@Repository
public interface ClienteRepo extends JpaRepository<Cliente,String>{
	
	@Query(  value = "SELECT * FROM Cliente u WHERE u.login = ?1 and u.password = ?2", 
			  nativeQuery = true)
	Usuario comprobarLogin(String usu, String pass);
	
}
