package com.involucionados.modelo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.involucionados.modelo.entidades.Pagos;

@Repository
public interface PagoRepo extends JpaRepository<Pagos,Integer>{
	
	@Query(  value = "select estado_pago from estado_pago INNER join pagos on pagos.estado_pago_id=estado_pago.id where pagos.cliente_rut=?", 
			  nativeQuery = true)
	  String comprobarDeuda(String rut);
	
	@Query(value="SELECT cliente.rut FROM cliente JOIN pagos  ON pagos.cliente_rut = cliente.rut where pagos.estado_pago_id=2",
	nativeQuery=true)
	List<String> obtenerDeudores();
}
