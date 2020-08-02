package com.involucionados.cotroladores;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.involucionados.modelo.entidades.ActividadMejora;
import com.involucionados.modelo.entidades.Asesoria;
import com.involucionados.servicio.interfaces.IActividadMejora;
import com.involucionados.servicio.interfaces.IAsesoriaServicio;





@Controller
public class ActividadMejoraControlador {
	
	@Autowired
	IActividadMejora actividadmejora;
	
	@Autowired
	IAsesoriaServicio asesoriaSer;
	
	
	
	
	
	@GetMapping (value= "revisar/{id}/crearActividadMejora")
	public String crearActividadMejora(@PathVariable int id, Model m) {
		
		
		
		
		ActividadMejora am = new ActividadMejora();
		
		System.out.println(am);
		m.addAttribute("command", am);
		return "IngresarActividadMejora";
	}
	
	@PostMapping(value = "revisar/{ida}/crearActividadMejora/guardarActividadMejora")
	public String guardarActividadMejora(@PathVariable int ida, ActividadMejora acme) {
		
		
		System.out.println(acme);
		
		ActividadMejora actividad = acme;
		
		
		Asesoria asesoria = asesoriaSer.obtenerAsesoria(ida);
		System.out.println(asesoria);
		
		actividad.setIdasesoria(asesoria);
		
		System.out.println(actividad);
		
//		nos falta agregar el id del estado de moera a la actividad de mejora
		
		actividad.setIdestadomejora(1);
		
		System.out.println("actividad de mejora previo a guardar: " + actividad);
		
		
		actividadmejora.agregarActividadMejora(actividad);
		
		
		
		
		
		
		//actividadmejora.eliminarActividadMejora(id);
		//actividadmejora.agregarActividadMejora(acme);
		return "redirect:/index";
	}
	
	@RequestMapping("listaActividadMejora")
	public String listaActividadMejora(Model m) {
		m.addAttribute("lista", actividadmejora.listarActividadMejora());
		return "ListaActividadMejora";
	}
	
	@RequestMapping("eliminarActividadMejora/{id}")
	public String eliminarActividadMejora(@PathVariable int id) {
		actividadmejora.eliminarActividadMejora(id);
		//return "redirect:/listaActividadMejora";
		return "EditarActividadMejora";
		
	}
	
	
 
	
	  @RequestMapping("editarActividadMejora/{id}") 
	  public String editarActividadMejora(@PathVariable int id, Model m){
	  
	  ActividadMejora am = actividadmejora.obtenerActividadMejora(id);
	 // System.out.println(am);
	  m.addAttribute("command", am);
	  return "EditarActividadMejora";
	  }
	 
	 
	
	@PostMapping(value = "/editaractividadmejora")
	public String editarActividadMejora(ActividadMejora acme) {
		
		
		
		ActividadMejora actividadprovisoria = actividadmejora.obtenerActividadMejora(acme.getId());
		
		acme.setIdasesoria(actividadprovisoria.getIdasesoria());
		
		
		
		
		//System.out.println("LLEGO AL METODO");
		System.out.println(acme);
		actividadmejora.editarActividadMejora(acme);
		return "index";
	}
	
	
	
	
	  @RequestMapping("aprobarActividadMejora/{id}") 
	  public String aprobarActividadMejora(@PathVariable int id, Model m){
	  
	 
		  ActividadMejora actividad = actividadmejora.obtenerActividadMejora(id);
		  
		  actividad.setIdestadomejora(2);
		  
		  
		  actividadmejora.editarActividadMejora(actividad);
		  
	  return "redirect:/listaActividadMejora";
	  }
	
	
	

}
