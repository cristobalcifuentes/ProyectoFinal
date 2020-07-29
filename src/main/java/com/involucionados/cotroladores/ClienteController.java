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
import com.involucionados.servicio.implementaciones.ClienteService;
import com.involucionados.servicio.implementaciones.UsuarioService;


@Controller
public class ClienteController {
	
	@Autowired
	ClienteService cser;
	
	@Autowired
	UsuarioService user;
	
	@GetMapping("Admin/getClientes")
	public String obtenerClientes(Model model) {
		model.addAttribute("clientes",cser.obtenerCliente());
		return "clientes";
	}
	
	@GetMapping("Admin/getClientes/editcli")
	public String editcli(@RequestParam String rut,Model model) {
		Cliente cliente = cser.obtenerCliente(rut);
		model.addAttribute("cliente",cliente);
		return "editCli";
	}
	
	@PostMapping("Admin/getClientes/editcli")
	public String editCliente(@RequestParam Map<String, String> datos,RedirectAttributes attr) {
		try {
			String rut = datos.get("rut");
			String razon = datos.get("razon");
			String dire = datos.get("direccion");
			String comu = datos.get("comuna");
			int telefono = Integer.parseInt(datos.get("telefono"));
			String act = datos.get("economica");
			String tipo = datos.get("tipo");
			int idusu = Integer.parseInt(datos.get("idusu"));
			String email = datos.get("email");
			
			Cliente c = new Cliente();
			c.setRut(rut);
			c.setRazonsocial(razon);
			c.setDireccion(dire);
			c.setComuna(comu);
			c.setTelefono(telefono);
			c.setActividadEco(act);
			c.setTipEmpresa(tipo);
			c.setUsuario(user.obtenerUsuario(idusu));
			c.setEmail(email);
			
			cser.editCliente(c);
			attr.addFlashAttribute("succes",true);
			return"redirect:/Admin/getClientes";
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		attr.addFlashAttribute("succes",false);
		return "redirect:/Admin/getClientes";
		
		
	}
	

}
