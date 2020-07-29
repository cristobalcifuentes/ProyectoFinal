package com.involucionados.modelo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.involucionados.modelo.entidades.Visita;

public interface IVisitaRepositorio extends JpaRepository<Visita, Integer> {

}
