package com.involucionados.modelo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.involucionados.modelo.entidades.CheklistAsesoria;
import com.involucionados.modelo.entidades.IDCheklistAsesoria;

public interface ICheklistAsesoriaRepositorio extends JpaRepository<CheklistAsesoria, IDCheklistAsesoria> {

}
