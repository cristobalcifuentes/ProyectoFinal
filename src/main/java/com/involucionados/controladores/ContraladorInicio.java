package com.involucionados.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContraladorInicio {
	
	@GetMapping(value={"/home", "", "/", "/index"})
	public String inicio() {
		
		
		return "index";
		
	}
	
	
	
	
}
