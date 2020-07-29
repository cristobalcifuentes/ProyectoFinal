package com.involucionados.modelo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.involucionados.modelo.entidades.ReporteAccidente;

public interface ReporteAccRepo  extends JpaRepository<ReporteAccidente,Integer>{
	
}
