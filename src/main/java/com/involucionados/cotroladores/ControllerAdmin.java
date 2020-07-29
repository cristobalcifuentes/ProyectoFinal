package com.involucionados.cotroladores;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.involucionados.servicio.implementaciones.EnvioMail;
import com.involucionados.servicio.implementaciones.PagosService;

@Controller
public class ControllerAdmin {
	
	@Autowired
	EnvioMail envio;
	
	@Autowired
	PagosService pser;
	
	
	@RequestMapping("Admin")
	public String panelAdmin() {
		return"admin";
	}
	
	@GetMapping("Admin/Notificaciones")
	public String crearnotificacion(Model model) {
		model.addAttribute("deudores",pser.obtnerDeudores());
		return "notificacion";
	}
	
	@PostMapping("Admin/Notificaciones")
	public String enviarnotificacion(@RequestParam Map<String,String> datos,RedirectAttributes attr) {
		
		String correo = datos.get("correo");
		String asunto = datos.get("asunto");
		String mensaje = datos.get("mensaje");
		envio.sendEmail(correo, asunto, mensaje);
		attr.addFlashAttribute("mensaje", "Correo Enviado Satisfactoriamente");
		return "redirect:/Admin/Notificaciones";
	}

}
