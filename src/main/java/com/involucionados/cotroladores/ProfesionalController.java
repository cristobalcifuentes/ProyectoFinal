package com.involucionados.cotroladores;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.involucionados.modelo.entidades.Cliente;
import com.involucionados.modelo.entidades.Profesional;
import com.involucionados.servicio.implementaciones.ProfesionalService;

@Controller
public class ProfesionalController {
	
	@Autowired
	ProfesionalService pser;
	
	@GetMapping("Admin/getProfesionales")
	public String obtenerPro(Model model) {
		model.addAttribute("profesionales",pser.obtenerProfesionales());
		return "profesionales";
	}
	
	@GetMapping("Admin/getClientes/editpro")
	public String editcli(@RequestParam int rut,Model model) {
		Profesional profesional = pser.obtenerProId(rut);
		model.addAttribute("profesional",profesional);
		return "editPro";
	}
	
//	@PostMapping("Admin/getClientes/editcli")
//	public String editCliente(@RequestParam Map<String, String> datos,RedirectAttributes attr) {
//		try {
//			String rut = datos.get("rut");
//			String razon = datos.get("razon");
//			String dire = datos.get("direccion");
//			String comu = datos.get("comuna");
//			int telefono = Integer.parseInt(datos.get("telefono"));
//			String act = datos.get("economica");
//			String tipo = datos.get("tipo");
//			int idusu = Integer.parseInt(datos.get("idusu"));
//			String email = datos.get("email");
//			
//			Cliente c = new Cliente();
//			c.setRut(rut);
//			c.setRazonsocial(razon);
//			c.setDireccion(dire);
//			c.setComuna(comu);
//			c.setTelefono(telefono);
//			c.setActividadEco(act);
//			c.setTipEmpresa(tipo);
//			c.setUsuario(user.obtenerUsuario(idusu));
//			c.setEmail(email);
//			
//			cser.editCliente(c);
//			attr.addFlashAttribute("succes",true);
//			return"redirect:/Admin/getClientes";
//			
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//		}
//		attr.addFlashAttribute("succes",false);
//		return "redirect:/Admin/getClientes";
//		
//		
//	}
	

}
