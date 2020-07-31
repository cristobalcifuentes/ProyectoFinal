package com.involucionados.modelo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.involucionados.modelo.entidades.Profesional;

@Repository
public interface ProfesionalRepo  extends JpaRepository<Profesional,Integer>{

}
