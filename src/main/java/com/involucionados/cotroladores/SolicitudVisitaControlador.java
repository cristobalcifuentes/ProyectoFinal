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
import com.involucionados.servicio.implementaciones.EstadoSolicitudServicio;
import com.involucionados.servicio.interfaces.IClienteService;
import com.involucionados.servicio.interfaces.IEstadoSolicitud;
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
	
	@Autowired
	IEstadoSolicitud estadosol;
	
	
		@RequestMapping("solicitudvisita")
		public String crearSolicitudVisita(Model m) {
		System.out.println("prueba");
		
		TipoVisita capacitacion = TipoVisitaSer.obtenerTipoVisita(1);
		TipoVisita asesoria = TipoVisitaSer.obtenerTipoVisita(2);
		TipoVisita asesoriae = TipoVisitaSer.obtenerTipoVisita(3);
		
		m.addAttribute("cap", capacitacion);
		m.addAttribute("ase", asesoria);
		m.addAttribute("asee", asesoriae);
			
		//creamos un objeto de tipo solicitudVisita vacio
		SolicitudVisita vis= new SolicitudVisita ();
		System.out.println("objeto recien creado: " + vis);
		
						
		m.addAttribute("command", vis);
		
		
		  return "CrearSolicitudVisita";
		  
	
		  
	}
	
	@PostMapping("guardarsolicitud")
	public String guardarsolicitud(SolicitudVisita vis, Model m ) {
		
		
		System.out.println("objeto SolicitudVisita que llega desde el formulario: " + vis);
		
		// creamos un objeto de tipo SolicitudVisita y le asignamos el que nos llego del formulario
		SolicitudVisita solicitud = vis;
		System.out.println("objeto solicitudVisita que creamo " + solicitud);
		
		//creamos objeto de tipo EstadoSolicitud en estado "pendiente"
		EstadoSolicitud estado= estadosol.obtenerEstadoSolicitud(1);
		
		//agregamos el objeto de tipo estadoSolicitud al objeto tipo solicitudVisita
		solicitud.setEstado(estado);
		System.out.println("objeto solicitud despues de agregar el estado" + solicitud);
		

		//creamos un objeto de tipo cliente
		Cliente cliente = clienteSer.obtenerCliente("123456");
		
		//agregamos el objeto cliente como atributo al objeto SolicituVisita
		solicitud.setCliente(cliente);
		System.out.println("objeto solicitudvista despues de agregar al cliente: " + solicitud);
		
		
		
		
		return "redirect:/index";
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
