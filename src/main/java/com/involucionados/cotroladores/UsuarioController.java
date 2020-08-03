package com.involucionados.cotroladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.involucionados.modelo.entidades.ReporteAccidente;
import com.involucionados.modelo.entidades.Usuario;
import com.involucionados.modelo.repositorios.UsuarioRepo;
import com.involucionados.servicio.implementaciones.ClienteService;
import com.involucionados.servicio.implementaciones.ReporteAccService;
import com.involucionados.servicio.implementaciones.RolService;
import com.involucionados.servicio.implementaciones.UsuarioService;

/**
 * @author Gerald
 *
 */
@Controller
public class UsuarioController {

	/** 
	 * instancias de Servicio
	 * */
	@Autowired
	UsuarioService user;
	
	@Autowired
	ClienteService cli;
	
	@Autowired
	RolService rols;
	
	@Autowired
	UsuarioRepo repousu;

	
	/** 
	 * Mapping login 
	 * */
	
	@Autowired
	ReporteAccService reporte;
	
	@GetMapping("/")
	public String redireccion(HttpServletRequest servlet,
		HttpSession sesion ,Model model) {

		System.out.println("paso aca");
		Usuario u = new Usuario();
		
		System.out.println(servlet.getRemoteUser());
		u = repousu.findByLogin(servlet.getRemoteUser());
		String rol = u.getRol().getRol();
		System.out.println(rol);
		
		if(rol.equalsIgnoreCase("cliente")) {
			System.out.println("Entro cli");
			sesion.setAttribute("rol",rol);
			sesion.setAttribute("cliente",u.getCliente());
			sesion.setAttribute("usuario",u);
			
		}else if(rol.equalsIgnoreCase("profesional")) {
			System.out.println("Entro pro");
			sesion.setAttribute("rol",rol);
			sesion.setAttribute("profesional",u.getProfesional());
			sesion.setAttribute("usuario",u);
			
		}else{
			System.out.println("Entro admin");
			sesion.setAttribute("rol","administrador");
			sesion.setAttribute("administrador",u.getAdministrador());
			sesion.setAttribute("usuario",u);
		}
		
		return "inicio2";
	}
	
	/** 
	 * Mapping para obtener usuario a editar
	 * */
	@GetMapping("/Admin/getClientes/editusu")
	public String obtenerUsuario(@RequestParam Integer id, Model model) {
		Usuario usuario = user.obtenerUsuario(id);
		model.addAttribute("usuario",usuario);
		return "editUsu";
	}
	
	/** 
	 * Mapping para rescatar datos de usuario a editar,
	 * ademas de finalmente construir y editar usuario espedifico
	 * */
	@PostMapping("/Admin/getClientes/editusu")
	public String editUsuario(@RequestParam Map<String, String> datos,RedirectAttributes attr) {
		try {
			int id = Integer.parseInt(datos.get("id"));
			int idrol = Integer.parseInt(datos.get("idusu"));
			String nombre = datos.get("nombre");
			String apellido = datos.get("apellido");
			String password = datos.get("password");
			String login = datos.get("login");
			
			Usuario u = new Usuario();
			u.setId(id);
			u.setRol(rols.obtenerRol(idrol));
			u.setNombre(nombre);
			u.setApellido(apellido);
			u.setPassword(password);
			u.setLogin(login);
			
			user.saveUser(u);
			attr.addFlashAttribute("succesusu",true);
			return"redirect:/Admin/getClientes";
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		attr.addFlashAttribute("succesusu",false);
		return "redirect:/Admin/getClientes";
		
		
	}
	
	@GetMapping("/Admin/estAccidentes")
	public String obtenerUsuario(Model model) {
		List<ReporteAccidente> reportes = new ArrayList<>();
		int cont =0;
		
		for (int i = 0; i < reportes.size(); i++) {
			cont ++;
		}
		model.addAttribute("accidentes", cont);
		
		return "accidentes";
	}

}