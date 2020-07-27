package com.involucionados.cotroladores;

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
		m.addAttribute("listae", EstadoSolicitud.listarEstadoSolicitud());
				return "LEstadoSolictud";
	}

	@RequestMapping("elimnarEstadoSolictud/{id}")
	public String eliminarEstadoSolicitud(@PathVariable int id) {
		EstadoSolicitud.eliminarEstadoSolicitud(id);
		return "redirect:/LEstadoSolictud";
	}

	@RequestMapping("editarEstadoSolicitud/{id}")
	public String editarEstadoSolicitud(@PathVariable int id, Model m) {
		
		EstadoSolicitud e = EstadoSolicitud.obtenerEstadoSolicitud(id);
		System.out.println(e);
		m.addAttribute("command", e);
		return "ModificarEstadoSolicitud";

	}
	
	@PostMapping(value = "editarEstadoSolicitud/guardarestadosolicitud")
	public String guardaredicionestado(EstadoSolicitud es) {
		System.out.println("llego al controlador");
		System.out.println(es.toString());
		EstadoSolicitud.agregarEstadoSolicitud(es);
		return "redirect:/index";

	}
	
}
