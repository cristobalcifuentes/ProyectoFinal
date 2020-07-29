package com.involucionados.modelo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.involucionados.modelo.entidades.Rol;




@Repository
public interface RolRepo extends JpaRepository<Rol,Integer>{

}
