package com.involucionados.modelo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.involucionados.modelo.entidades.TipoVisita;

public interface ITipoVisitaRepositorio extends JpaRepository<TipoVisita, Integer > {

}
