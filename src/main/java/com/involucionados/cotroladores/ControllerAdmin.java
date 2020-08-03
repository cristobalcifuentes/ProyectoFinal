package com.involucionados.cotroladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.involucionados.modelo.entidades.Cliente;
import com.involucionados.modelo.entidades.ReporteAccidente;
import com.involucionados.modelo.entidades.SolicitudVisita;
import com.involucionados.modelo.entidades.Usuario;
import com.involucionados.servicio.implementaciones.ClienteService;
import com.involucionados.servicio.implementaciones.EnvioMail;
import com.involucionados.servicio.implementaciones.PagosService;
import com.involucionados.servicio.implementaciones.UsuarioService;
import com.involucionados.servicio.interfaces.IClienteService;
import com.involucionados.servicio.interfaces.IReporteAccidenteService;
import com.involucionados.servicio.interfaces.ISolicitudVisitaServicio;

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
	
	@Autowired
	IReporteAccidenteService acc;
	
	@Autowired
	ISolicitudVisitaServicio solicitud;
	
	
	@Autowired
	IClienteService clienteSer;
	
	
	
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
				+ "Quisiera Avisarle que usted posee deudas , ante "
				+ "esta situacion, no podra solicitar mas visitas ni reportes,"
				+ "ruego poner fin a esta situacion cancelando lo mas pronto"
				+ "posible."
				+ "Atte: Involucionados Inc";
	
		envio.sendEmail(correo,asunto ,mensaje);
		System.out.println(c.getEmail());
		attr.addFlashAttribute("correo",true);
		return "redirect:/Admin/Notificaciones";
	}

	
	@GetMapping("Admin/Globales")
	public String globales(Model m) {
		
		List<ReporteAccidente> accidentes = acc.listarAccidentes();
		int cantidadAcc = 0 ;
		
		for(ReporteAccidente r: accidentes) {
			cantidadAcc ++;
			
		}
		
		List<SolicitudVisita> solicitudes = solicitud.listarSolicitud();
		
		int cantidadSolicitudes = 0;
		
		int solicitudesCapacitacion = 0;
		
		int solicitudesAsesorias = 0;
		
		int solicitudesAsesoriasE = 0;
		
			System.out.println("Cantidad de Solicitudes" +solicitudes.indexOf(0));
		for(SolicitudVisita s: solicitudes) {
			
			cantidadSolicitudes ++;
			
			if(s.getTipo().getId()==1) {
				solicitudesCapacitacion++;
			}else if(s.getTipo().getId()==2) {
				solicitudesAsesorias++;
			}else if(s.getTipo().getId()==3) {
				solicitudesAsesoriasE ++;
			}
			
		}
		
		m.addAttribute("accidentes", cantidadAcc);
		m.addAttribute("solicitudes", cantidadSolicitudes);
		m.addAttribute("capacitaciones", solicitudesCapacitacion);
		m.addAttribute("asesorias", solicitudesAsesorias);
		m.addAttribute("asesoriasE", solicitudesAsesoriasE);
		
		return "ReporteGlobal";
	}
	
	@GetMapping("Admin/Cliente")
	public String reporteCliente(Model m) {
		
		List<Cliente> clientes = clienteSer.obtenerCliente();
		
		m.addAttribute("clientes", clientes);
		
		return "ListadoClientes";
	}
	
	@GetMapping("Admin/reporte/{rut}")
	public String reporteClienteRut(@PathVariable String rut, Model m) {
		
		Cliente cliente = clienteSer.obtenerCliente(rut);
		
		List<SolicitudVisita> solicitudes = solicitud.listarSolicitud();
		
		List<SolicitudVisita> solicitudesCliente = new ArrayList<SolicitudVisita>();
		
		int cantSolicitudes = 0;
		
		int solicitudesCapacitacion = 0;
		
		int solicitudesAsesorias = 0;
		
		int solicitudesAsesoriasE = 0;
		
		
		for(SolicitudVisita s: solicitudes) {
			
			System.out.println(s);
			
			System.out.println(s.getCliente());
			
			System.out.println(s.getCliente().getRut());
			
			System.out.println("entro al for");
			
			if(s.getCliente().getRut().equalsIgnoreCase(rut)) {
				
				System.out.println("entro al if");
				
				cantSolicitudes++;
				
				if(s.getTipo().getId()==1) {
					solicitudesCapacitacion++;
				}else if(s.getTipo().getId()==2) {
					solicitudesAsesorias++;
				}else if(s.getTipo().getId()==3) {
					solicitudesAsesoriasE ++;
				}
				
				solicitudesCliente.add(s);
				
				
			}
			
			
		}
		
		
		List<ReporteAccidente> accidentes = acc.listarAccidentes();
		
		List<ReporteAccidente> accidentesCliente = new ArrayList<ReporteAccidente>();
		
		int cantAccidente = 0;
		
		for(ReporteAccidente r: accidentes ) {
			
			if(r.getCliente().getRut().equalsIgnoreCase(rut))
				
				cantAccidente++;
			
				accidentesCliente.add(r);
			
				
		}
		
		
		m.addAttribute("cliente", cliente);
		//listado de solicitudes
		m.addAttribute("solicitudes", solicitudesCliente);
		//cantidad de solicitudes
		m.addAttribute("cantSolicitudes", cantSolicitudes);
		//cantidad de capacitaciones solicitadas
		m.addAttribute("capacitaciones", solicitudesCapacitacion);
		//cant asesorias solicitadas
		m.addAttribute("asesorias", solicitudesAsesorias);
		//cantidad de asesorias especiales solicitadas
		m.addAttribute("asesoriasE", solicitudesAsesoriasE);
		//listado accidendes del cliente
		m.addAttribute("accidentes", accidentesCliente);
		//cantidad de accidentes del cliente
		m.addAttribute("cantAccidente", cantAccidente);
		
	
		return "ReporteCliente";
	}
	
	
	
	
	
	
	
	
}
