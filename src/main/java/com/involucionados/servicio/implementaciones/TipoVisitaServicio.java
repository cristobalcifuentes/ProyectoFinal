package com.involucionados.servicio.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.involucionados.modelo.entidades.TipoVisita;
import com.involucionados.modelo.repositorios.ITipoVisitaRepositorio;
import com.involucionados.servicio.interfaces.ITipoVisitaServicio;

@Service
public class TipoVisitaServicio implements ITipoVisitaServicio {
	
	@Autowired
	ITipoVisitaRepositorio tvisita;

	@Autowired 
	EntityManager vi;
	
	@Override
	public TipoVisita obtenerTipoVisita(int id) {
		
				return vi.find(TipoVisita.class, id);
	}

	@Override
	public List<TipoVisita> listarTipoVisita() {
		
		// TODO Auto-generated method stub
		return tvisita.findAll();
	}

	@Override
	public void agregaTipoVisita(TipoVisita v) {
		tvisita.save(v);

	}

	@Override
	public void eliminarTipoVisita(int id) {
		tvisita.deleteById(id);
	}

	@Override
	public void editarTipoVisita(TipoVisita v) {
		tvisita.save(v);

	}

}
