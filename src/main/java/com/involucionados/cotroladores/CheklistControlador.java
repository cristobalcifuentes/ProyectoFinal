package com.involucionados.cotroladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.involucionados.modelo.entidades.Cheklist;
import com.involucionados.servicio.interfaces.ICheklistServicio;

@Controller
public class CheklistControlador {
	
	@Autowired
	ICheklistServicio chek;
	
	@GetMapping("crearChek")
	public String mostrarFormulario(Model m) {
		
		m.addAttribute("command", new Cheklist());
		
		return "CrearChek";
	}
	
	
	@PostMapping("crearChek")
	public String guardarChek(Model m, Cheklist c) {
		
		System.out.println(c);
		chek.agregarCheklist(c);
		return "index";
	}
	
	

}
