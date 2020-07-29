package com.involucionados.cotroladores;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.involucionados.modelo.entidades.Cliente;
import com.involucionados.modelo.entidades.ReporteAccidente;
import com.involucionados.modelo.entidades.Trabajador;
import com.involucionados.servicio.implementaciones.ClienteService;
import com.involucionados.servicio.implementaciones.PagosService;
import com.involucionados.servicio.implementaciones.ReporteAccService;
import com.involucionados.servicio.implementaciones.TrabajadorService;

@Controller
public class ControllerAccidente {

	@Autowired
	PagosService pService;
	@Autowired
	ClienteService cliserv;
	@Autowired
	ReporteAccService repService;
	@Autowired
	TrabajadorService traS;

	@GetMapping("/formulario")
	public String formularios() {
		return "formularios";
	}

	@RequestMapping("/formAccidente")
	public String comprobarDeuda(HttpSession sesion,RedirectAttributes attr) {
		String res = "";
		Cliente c = (Cliente) sesion.getAttribute("cliente");
		String deuda = pService.comprobarDeuda(c.getRut());
		if (deuda.equalsIgnoreCase("deuda")) {
			attr.addFlashAttribute("deuda",true);
			res = "redirect:/formulario";
		} else {
			res = "formAccidente";
		}
		return res;
	}

	@PostMapping("/accidente")
	public String saveAccident(@RequestParam Map<String, String> todos,RedirectAttributes attr) {

		int serie = Integer.parseInt(todos.get("txtserie"));
		String rutCli = todos.get("txtrucliente");
		String rutTra = todos.get("txtruttra");
		String nomTra = todos.get("txtnombrestra");
		String dirTra = todos.get("txtdirecciontra");
		String comTra = todos.get("txtcomtra");
		int telTra = Integer.parseInt(todos.get("txtteltra"));
		String sexTra = todos.get("sexo");
		
		 
		 
		 ReporteAccidente r = new ReporteAccidente();
		 r.setId(serie);
		 r.setFecha(obtenerFecha());
		 r.setCliente(cliserv.obtenerCliente(rutCli));
		 System.out.println(r);
		 repService.saveReporteAcc(r);
		 
		 Trabajador t = new Trabajador(rutTra, nomTra, dirTra, comTra, telTra, sexTra,r);
		 traS.saveTrabajador(t);
		 attr.addFlashAttribute("reporte",true);
		return "redirect:/formulario";
	}
	
	public String obtenerFecha() {
		Calendar fecha = new GregorianCalendar();                       
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        return ""+dia+"/"+(mes+1)+"/"+año+"";
	}

}
