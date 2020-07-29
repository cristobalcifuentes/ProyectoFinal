package com.involucionados.modelo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.involucionados.modelo.entidades.Trabajador;


@Repository
public interface TrabajadorRepo  extends JpaRepository<Trabajador,Integer>{
	
	

}
