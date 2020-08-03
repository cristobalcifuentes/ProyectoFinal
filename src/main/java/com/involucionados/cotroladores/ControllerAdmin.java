package com.involucionados.cotroladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.involucionados.modelo.entidades.Cliente;
import com.involucionados.modelo.entidades.Usuario;
import com.involucionados.servicio.implementaciones.ClienteService;
import com.involucionados.servicio.implementaciones.EnvioMail;
import com.involucionados.servicio.implementaciones.PagosService;
import com.involucionados.servicio.implementaciones.UsuarioService;

@Controller
public class ControllerAdmin {
	
	@Autowired
	EnvioMail envio;
	
	@Autowired
	PagosService pser;
	
	@Autowired
	ClienteService cser;
	
	@Autowired
	UsuarioService user;
	
	
	@RequestMapping("Admin")
	public String panelAdmin() {
		return"admin";
	}
	
	@GetMapping("Admin/Notificaciones")
	public String crearnotificacion(Model model) {
		List<String> deudores = pser.obtnerDeudores();
		List<Cliente> lista = new ArrayList<Cliente>();
		
		for (int i = 0; i < deudores.size(); i++) {
			lista.add(cser.obtenerCliente(deudores.get(i)));
		}
		model.addAttribute("deudores",lista);
		return "notificacion";
	}
	
	@PostMapping("Admin/Notificaciones")
	public String enviarnotificacion(@RequestParam(value="rut") String rut,RedirectAttributes attr) {
	
		Cliente c= new Cliente();
		Usuario u = new Usuario();
		
		c = cser.obtenerCliente(rut);
		u = user.obtenerUsuario(c.getUsuario().getId());
		
		String correo = c.getEmail();
		String asunto ="Deudas Sistema";
		String mensaje="Sr(a): "+u.getNombre()+"\s"+u.getApellido()+", "
				+ "Quisiera Avisarle que usted posee deudas , ante"
				+ "esta situacion, no podra solicitar mas visitas ni reportes,"
				+ "ruego poner fin a esta situacion cancelando lo mas pronto"
				+ "posible."
				+ "Atte: Involucionados Inc";
	
		envio.sendEmail(correo,asunto ,mensaje);
		System.out.println(c.getEmail());
		attr.addFlashAttribute("correo",true);
		return "redirect:/Admin/Notificaciones";
	}

}
