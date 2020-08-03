package com.involucionados.cotroladores;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.involucionados.modelo.entidades.Cliente;
import com.involucionados.modelo.entidades.Profesional;
import com.involucionados.servicio.implementaciones.ProfesionalService;
import com.involucionados.servicio.implementaciones.UsuarioService;

@Controller
public class ProfesionalController {
	
	@Autowired
	ProfesionalService pser;
	
	@Autowired
	UsuarioService user;
	
	@Autowired
	BCryptPasswordEncoder cryp;
	
	@GetMapping("Admin/getProfesionales")
	public String obtenerPro(Model model) {
		model.addAttribute("profesionales",pser.obtenerProfesionales());
		return "profesionales";
	}
	
	@GetMapping("Admin/getProfesionales/editpro")
	public String editcli(@RequestParam int rut,Model model) {
		Profesional profesional = pser.obtenerProId(rut);
		model.addAttribute("profesional",profesional);
		return "editPro";
	}
	
	@PostMapping("Admin/getProfesionales/editpro")
	public String editCliente(@RequestParam Map<String, String> datos,RedirectAttributes attr) {
		try {
			int rut = Integer.parseInt(datos.get("rut"));
			int id = Integer.parseInt(datos.get("idpro"));
			String profesion = datos.get("profesion");
			String email = datos.get("email");
			String salud = datos.get("salud");
			
			Profesional p = new Profesional();
			p.setRut(rut);
			p.setProfesion(profesion);
			p.setEmail(email);
			p.setUsuario(user.obtenerUsuario(id));
			p.setSalud(salud);
		
			pser.editProfesional(p);
			attr.addFlashAttribute("succes",true);
			return"redirect:/Admin/getProfesionales";
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		attr.addFlashAttribute("succes",false);
		return "redirect:/Admin/getProfesionales";
		
		
	}
	

}