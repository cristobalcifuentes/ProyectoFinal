package com.involucionados.cotroladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.involucionados.modelo.entidades.Asesoria;
import com.involucionados.modelo.entidades.CheklistAsesoria;
import com.involucionados.servicio.interfaces.IAsesoriaServicio;
import com.involucionados.servicio.interfaces.ICheklistAsesoriaServicio;

@Controller
public class ActividadMejora2Controlador {
	
	@Autowired
	IAsesoriaServicio asesoriaSer;
	
	@Autowired
	ICheklistAsesoriaServicio chekasesoriaSer;
	
	
	
	@GetMapping("nuevaActividadMejora" )
	public String buscarAsesorias(Model m) {
		
		List<Asesoria> asesorias = asesoriaSer.listarAsesoria();
				
		m.addAttribute("asesorias",	asesorias);
		
		
		return "AsesoriasMejoras";
	}
	
	
	
	
	
	@GetMapping("revisar/{id}" )
	public String revisar(@PathVariable int id, Model m) {
		
		
		List<CheklistAsesoria> chekase =  chekasesoriaSer.listarCheklistAsesoria();
		
		List<CheklistAsesoria> chekesta = new ArrayList<CheklistAsesoria>();
		
		for(CheklistAsesoria ca: chekase) {
			
			if(ca.getAsesoria().getId() == id && ca.getChek().getId() == 1) {
				
				chekesta.add(ca);
				
			}
				
						
		}
		
		
		m.addAttribute("listado", chekesta);
		
		
		
		
		return "ChekNoCumple";
	}
	
	
	
	
	
	
	
	
	

}
