package com.involucionados.cotroladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.involucionados.modelo.entidades.Cheklist;
import com.involucionados.servicio.interfaces.ICheklistServicio;

@Controller
public class CheklistControlador {
	
	@Autowired
	ICheklistServicio chek;
	
	@GetMapping("Profesional/crearChek")
	public String mostrarFormulario() {
		return "CrearChek";
	}
	
	
	@PostMapping("Profesional/crearChek")
	public String guardarChek(@RequestParam(name="check") String check) {
		Cheklist checklist = new Cheklist();
		checklist.setChek(check);
		System.out.println(checklist);
		chek.agregarCheklist(checklist);
		return "redirect:/Profesional";
	}
	
	

}
