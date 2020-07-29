package com.involucionados.cotroladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.involucionados.modelo.entidades.EstadoSolicitud;
import com.involucionados.servicio.interfaces.IEstadoSolicitud;

@Controller
public class EstadoSolicitudControlador {
	
	@Autowired
	IEstadoSolicitud EstadoSolicitud;
	
	@GetMapping (value ="/crearestadosolicitud")
	public String crearestadosolicitud(Model m) {
		m.addAttribute("command" , new EstadoSolicitud());
		return "CrearEstadoSolicitud";
	}
	
	@PostMapping(value = "/guardarestadosolicitud")
	public String guardarestadosolicitud(EstadoSolicitud es) {
		System.out.println(es.toString());
		EstadoSolicitud.agregarEstadoSolicitud(es);
		return "index";

	}

	@RequestMapping("listaEstadoSolictud")
	public String listaEstadoSolicitud(Model m) {
		System.out.println("prueba");
		List<EstadoSolicitud> lista= EstadoSolicitud.listarEstadoSolicitud();
		System.out.println(lista);
		m.addAttribute("listae", lista );
		    return "LEstadoSolicitud";
	}

	@RequestMapping("elimnarEstadoSolictud/{id}")
	public String eliminarEstadoSolicitud(@PathVariable int id) {
		EstadoSolicitud.eliminarEstadoSolicitud(id);
			return "redirect:/listaEstadoSolictud";
	}

	@RequestMapping("EditarEstadoSolicitud/{id}")
	public String EditarEstadoSolicitud(@PathVariable int id, Model m) {
		EstadoSolicitud estados = EstadoSolicitud.obtenerEstadoSolicitud(id);
		System.out.println(estados);
		m.addAttribute("command", estados);
		return "ModificarEstadoSolicitud";

	}
	
	@PostMapping(value = "/EditarEstadoSolicitud")
	public String guardaredicionestado(EstadoSolicitud es) {
		System.out.println("llego al controlador");
		System.out.println(es.toString());
		EstadoSolicitud.agregarEstadoSolicitud(es);
		return "redirect:/index";

	}
	
}
