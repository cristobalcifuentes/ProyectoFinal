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
	
	@GetMapping (value= "revisar/crearActividadMejora/{id}")
	public String crearActividadMejora(@PathVariable int id, Model m) {
		
		
		Asesoria asesoria = asesoriaSer.obtenerAsesoria(id);
		
		
		ActividadMejora am = new ActividadMejora();
		am.setIdasesoria(asesoria);
		
		m.addAttribute("command", am);
		return "IngresarActividadMejora";
	}
	
	@PostMapping(value = "/guardarActividadMejora")
	public String guardarActividadMejora(ActividadMejora acme) {
		System.out.println( "Pase por acá");
		//actividadmejora.eliminarActividadMejora(id);
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
		//return "redirect:/listaActividadMejora";
		return "EditarActividadMejora";
		
	}
	
	
 
	
	  @RequestMapping("editarActividadMejora/{id}") 
	  public String editarActividadMejora(@PathVariable int id, Model m){
	  
	  ActividadMejora am = actividadmejora.obtenerActividadMejora(id);
	  System.out.println(am);
	  m.addAttribute("command", am);
	  return "EditarActividadMejora";
	  }
	 
	 
	
	@PostMapping(value = "/editaractividadmejora")
	public String editarActividadMejora(ActividadMejora acme) {
		System.out.println(acme);
		actividadmejora.editarActividadMejora(acme);
		return "index";
	}
	
	
	
	

}
