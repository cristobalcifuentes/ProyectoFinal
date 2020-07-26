package com.involucionados.cotroladores;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.involucionados.modelo.entidades.ActividadMejora;

import com.involucionados.servicio.interfaces.IActividadMejora;


@Controller
public class ActividadMejoraControlador {
	
	@Autowired
	IActividadMejora actividadmejora;
	
	@GetMapping (value= "/crearActividadMejora")
	public String crearActividadMejora(Model m) {
		m.addAttribute("command", new ActividadMejora());
		return "IngresarActividadMejora";
	}
	
	@PostMapping(value = "/guardarActividadMejora")
	public String guardarActividadMejora(ActividadMejora acme) {
		System.out.println( "Pase por acá");
		actividadmejora.agregarActividadMejora(acme);
		return "index";
	}
	
	@RequestMapping("listaActividadMejora")
	public String listaActividadMejora(Model m) {
		m.addAttribute("lista", actividadmejora.listarActividadMejora());
		return "ListaActividadMejora";
	}
	
	@RequestMapping("eliminarActividadMejora/{id}")
	public String eliminarActividadMejora(@PathVariable int id) {
		actividadmejora.eliminarActividadMejora(id);
		return "redirect:/listaActividadMejora";
		
	}
	
	@RequestMapping("editarActividadMejora/{id}")
	public String editarActividadMejora(@PathVariable int id, Model m) {
		
		ActividadMejora am= actividadmejora.obtenerActividadMejora(id);
		m.addAttribute("command", am);
		return "editarActividadMejora";
		
	}
	
	@PostMapping(value = "editarActividadMejora/guardaractividadmejora")
	public String guardarEditarActividadMejora(ActividadMejora acme) {
		
		return "redirect:/index";
	}
	
	
	
	

}
