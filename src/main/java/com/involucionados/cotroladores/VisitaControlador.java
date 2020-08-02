package com.involucionados.cotroladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.involucionados.modelo.entidades.EstadoSolicitud;
import com.involucionados.modelo.entidades.Profesional;
import com.involucionados.modelo.entidades.SolicitudVisita;
import com.involucionados.modelo.entidades.Visita;
import com.involucionados.servicio.interfaces.ISolicitudVisitaServicio;
import com.involucionados.servicio.interfaces.IVisitaServicio;

@Controller
public class VisitaControlador {

	@Autowired
	ISolicitudVisitaServicio solicitud;

	@Autowired
	IVisitaServicio visitaSer;

	@GetMapping("Profesional/solicitudesPendientes" )
	public String buscarSolicitudes(Model m) {
		System.out.println("entro al metodo");
		List<SolicitudVisita> solicitudes = solicitud.listarSolicitud();

		List<SolicitudVisita> solicitudesPendientes = new ArrayList<SolicitudVisita>();

		for (SolicitudVisita sol : solicitudes) {

			if (sol.getEstado().getId() == 1) {

				SolicitudVisita solicitud = new SolicitudVisita();

				solicitud = sol;
				System.out.println(solicitud);
				solicitudesPendientes.add(solicitud);

			}
		}

		m.addAttribute("solicitudesPendientes", solicitudesPendientes);

		return "PlanificarVisita";
	}

	@PostMapping("Profesional/planificarVisita/{IdSolicitud}")
	public String agendarVisita(@PathVariable int IdSolicitud, Model m) {

		// obtenemos la solicitud visita por medio de su id
		SolicitudVisita soli = solicitud.obtenerSolicitud(IdSolicitud);
		
		
		Profesional profesional =new Profesional();
		
		profesional.setRut(12345678);
		
		m.addAttribute("soli", soli);
		m.addAttribute("profesional", profesional);
		m.addAttribute("command", new Visita());

		return "AgendarVisita";

	}
	//planificarVisita/RegistrarVisita
	//planificarVisita/RegistrarVisita/63
	@PostMapping("Profesional/planificarVisita/RegistrarVisita/{idSoli}")
	public String registrarVisita(@PathVariable int idSoli, Visita visita, Model m) {

		
		System.out.println("esntro al metodo");
		// obtenemos la solicitud visita por medio de su id
		SolicitudVisita soli = solicitud.obtenerSolicitud(idSoli);

		// creamos un estado de visita tipo "AGENDADO"
		EstadoSolicitud estado = new EstadoSolicitud(2);

		// cambiamos el estado de la solicitud visita a "agendado"
		soli.setEstado(estado);

		// agregamos la solicitud de visita a la visita
		visita.setSolicitud(soli);
		System.out.println(visita);
		
		Profesional profesional = new Profesional();
		
		profesional.setRut(12345678);
		
		
		visita.setRutProfesional(profesional);
		
		// guardamos la visita
		visitaSer.agregarVisita(visita);

		// editamos la solicitud de visita con su nuevo estaddo en la base de datos
		solicitud.editarSolicitud(soli);

		m.addAttribute("soli", soli);
		m.addAttribute("visita", visita);

		return "ConfirmacionVisita";
	}

	@GetMapping("Profesional/planificarVisita/RegistrarVisita/Profesional/solicitudesPendientes")
	public String redireccion1() {
		return "redirect:/Profesional/solicitudesPendientes";
	}

	@GetMapping("Profesional/planificarVisita/RegistrarVisita/Profesional/")
	public String redireccion2() {
		return "redirect:/Profesional";
	}

}
