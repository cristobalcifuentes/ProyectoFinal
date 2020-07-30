package com.involucionados.cotroladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ContraladorInicio {
	
	
	  @GetMapping(value={"/home", "", "/", "/index"}) 
	  public String inicio() {
	  return "index"; }
	  
	  @GetMapping(value="/index1") 
	  public String inicio2() {
	  return "index1"; }
	 
	

	
}
