package com.involucionados.cotroladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.involucionados.modelo.entidades.Capacitacion;
import com.involucionados.servicio.interfaces.ICapacitacionServicio;

@Controller
public class CapacitacionControlador {

	@Autowired
	ICapacitacionServicio capacitacion;

	@GetMapping(value = "/Profesional/crearcapacitacion")
	public String crearCapacitacion(Model m) {
		m.addAttribute("command", new Capacitacion());
		return "CrearCapacitacion";

	}

	@PostMapping(value = "/Profesional/guardarcapacitacion")
		public String guardarCapacitacion(Capacitacion c, @RequestParam (value="contenido") String contenido) {
		
		System.out.println(contenido);
		
		String cont = contenido;
		c.setContenido(cont);
		
		

		System.out.println(c.toString());
		capacitacion.agregarCapacitacion(c);
		
		return "redirect:/Profesional";

	}

	@RequestMapping("Profesional/Profesional/listaCapacitacion")
	public String listaCapacitacion(Model m) {
		m.addAttribute("lista", capacitacion.listarCapacitacion());
		return "ListaCapacitacion";
	}

	@RequestMapping("Profesional/elimnarCapacitacion/{id}")
	public String eliminarCapacitacion(@PathVariable int id) {
		
		capacitacion.eliminarCapacitacion(id);
		
		return "redirect:/Profesional/listaCapacitacion";
	}

	@RequestMapping("Profesional/editarCapacitacion/{id}")
	public String editarCapacitacion(@PathVariable int id, Model m) {

		Capacitacion cp = capacitacion.obtenerCapacitacion(id);
		System.out.println(cp);
		m.addAttribute("command", cp);
		m.addAttribute("capacitacion", cp);
		
		return "modificarCapacitacion";

	}

	@RequestMapping("Profesional/detalleCapacitacion/{id}")
	public String detalleCapacitacion(@PathVariable int id, Model m) {
		
		
		
		Capacitacion cp = capacitacion.obtenerCapacitacion(id);
		System.out.println(cp);
		m.addAttribute("capacitacion", cp);
		
		return "mostrarCapacitacion";
	}
	
	
	
	

	@PostMapping(value = "Profesional/editarCapacitacion/guardarcapacitacion")
	public String guaedarEdicionCapac(Capacitacion c) {
		
		System.out.println("llego al controlador");
		System.out.println(c.toString());
		capacitacion.agregarCapacitacion(c);
		
		return "redirect:/Profesional";

	}
	
	
	
	
	

	

	

}
