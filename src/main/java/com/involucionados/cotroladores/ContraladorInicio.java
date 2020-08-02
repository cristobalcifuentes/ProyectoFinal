package com.involucionados.cotroladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ContraladorInicio {
	
	  @GetMapping(value="/login") 
	  public String inicio() {
	  return "index1";
	  }
	 
}
