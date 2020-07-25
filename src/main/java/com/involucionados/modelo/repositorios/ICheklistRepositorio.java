package com.involucionados.modelo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.involucionados.modelo.entidades.Cheklist;

public interface ICheklistRepositorio extends JpaRepository<Cheklist, Integer> {

}
