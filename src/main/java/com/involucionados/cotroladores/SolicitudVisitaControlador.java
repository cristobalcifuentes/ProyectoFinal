package com.involucionados.cotroladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.involucionados.modelo.entidades.Cliente;
import com.involucionados.modelo.entidades.EstadoSolicitud;
import com.involucionados.modelo.entidades.SolicitudVisita;
import com.involucionados.modelo.entidades.TipoVisita;
import com.involucionados.servicio.interfaces.IClienteService;
import com.involucionados.servicio.interfaces.ISolicitudVisitaServicio;
import com.involucionados.servicio.interfaces.ITipoVisitaServicio;

@Controller
public class SolicitudVisitaControlador {

	@Autowired
	ISolicitudVisitaServicio SolicitudVisitaSer;
	
	@Autowired
	ITipoVisitaServicio TipoVisitaSer;
	
	
	@Autowired
	IClienteService clienteSer;
	
	
		@RequestMapping("solicitudvisita")
		public String crearSolicitudVisita(Model m) {
		System.out.println("prueba");
		
		TipoVisita capacitacion = TipoVisitaSer.obtenerTipoVisita(1);
		TipoVisita asesoria = TipoVisitaSer.obtenerTipoVisita(2);
		TipoVisita asesoriae = TipoVisitaSer.obtenerTipoVisita(3);
		
		m.addAttribute("cap", capacitacion);
		m.addAttribute("ase", asesoria);
		m.addAttribute("asee", asesoriae);
			
		
		SolicitudVisita vis= new SolicitudVisita ();
		
		
						
		m.addAttribute("command", vis);
		  return "CrearSolicitudVisita";
	
		  
	}
	
	@PostMapping("guardarsolicitud")
	public void guardarsolicitud(SolicitudVisita vis, Model m ) {
		
		
		
		Cliente cliente = clienteSer.obtenerCliente("123456");
		
		
		
		vis.setCliente(cliente);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
