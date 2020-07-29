package com.involucionados.cotroladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> gerald

@Controller
public class ContraladorInicio {
	
	/*
	 * @GetMapping(value={"/home", "", "/", "/index"}) public String inicio() {
	 * return "index"; }
	 */
	
	@GetMapping("/")
	public String index() {
		return "index1";
	}
	
	
}
