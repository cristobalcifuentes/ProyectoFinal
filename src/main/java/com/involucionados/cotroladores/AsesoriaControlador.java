package com.involucionados.cotroladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.involucionados.modelo.entidades.Asesoria;
import com.involucionados.modelo.entidades.Cheklist;
import com.involucionados.modelo.entidades.CheklistAsesoria;
import com.involucionados.modelo.entidades.EstadoChek;
import com.involucionados.modelo.entidades.EstadoSolicitud;
import com.involucionados.modelo.entidades.SolicitudVisita;
import com.involucionados.modelo.entidades.Visita;
import com.involucionados.servicio.interfaces.IAsesoriaServicio;
import com.involucionados.servicio.interfaces.ICheklistAsesoriaServicio;
import com.involucionados.servicio.interfaces.ICheklistServicio;
import com.involucionados.servicio.interfaces.IEstadoChekServicio;
import com.involucionados.servicio.interfaces.ISolicitudVisitaServicio;
import com.involucionados.servicio.interfaces.IVisitaServicio;

@Controller
public class AsesoriaControlador {
	
	
	
	@Autowired
	ISolicitudVisitaServicio solicitudSer;
	
	@Autowired
	IVisitaServicio visitaSer;
	
	@Autowired
	ICheklistServicio chekSer;
	
	@Autowired
	IEstadoChekServicio estadoSer;
	
	@Autowired
	IAsesoriaServicio asesoriaSer;
	
	@Autowired
	ICheklistAsesoriaServicio chekasesoriaSer;
	
	
	
	
	@GetMapping("solicitudesAgendadas" )
	public String buscarSolicitudes(Model m) {
		//System.out.println("entro al metodo");
		List<SolicitudVisita> solicitudes = solicitudSer.listarSolicitud();
	
		List<SolicitudVisita> solicitudesAgendadas = new ArrayList<SolicitudVisita>();
		
		

		for (SolicitudVisita sol : solicitudes) {
			
			if (sol.getEstado().getId() == 2 && (sol.getTipo().getId()== 2 || sol.getTipo().getId()== 3)) {

				SolicitudVisita solicitud = new SolicitudVisita();

				solicitud = sol;
		//		System.out.println(solicitud);
				
				solicitudesAgendadas.add(solicitud);

			}
		}
		
		List<Visita> visitas = visitaSer.listarVisita();
		
		List<SolicitudVisita> solicitudesConFecha = new ArrayList<SolicitudVisita>();
		
		for (SolicitudVisita sv : solicitudesAgendadas) {
			
			for (Visita v : visitas) {

				if(v.getSolicitud().getId() ==sv.getId() ) {

					sv.setVisitaAsociada(v);
					
					solicitudesConFecha.add(sv);
					
					System.out.println(sv.getVisitaAsociada().getFecha());
					
				}
				
			}
					
		}
		
		
		m.addAttribute("solicitudesPendientes", solicitudesConFecha);

		return "AsesoriasAgendadas";
	}
	
	
	
	
	
	
	

	@PostMapping("ingresarAsesoria/{idVisita}/{id}")
	public String algo(@PathVariable int idVisita, @PathVariable int id, Model m) {

		//System.out.println("entro al metodo");
		SolicitudVisita solicitud = solicitudSer.obtenerSolicitud(id);
		Visita visita = visitaSer.obtenerVisita(idVisita);
		
		System.out.println(solicitud);
		solicitud.setVisitaAsociada(visita);
		
		System.out.println(visita);
		System.out.println(solicitud);
		
		List<Cheklist> lista = chekSer.listarCheklist();
		for(Cheklist c: lista) {
			System.out.println(c);
		}
		
		m.addAttribute("lista", lista);
		m.addAttribute("visita", visita);
		m.addAttribute("solicitud", solicitud);
		

	
		return "DesplegarAsesoria";
	}

	
	
	
	@PostMapping("ingresarAsesoria/{idVisita}/RescatarAsesoria")
	public String rescatarAsesoria(@PathVariable int idVisita, @RequestParam Map<String, String> datos, Model m) {
		System.out.println("******************** entro al metodo rescatar asesoria ******************** ");
		
//		traemos listado completo de cheklist
		List<Cheklist> lista = chekSer.listarCheklist();		
		
//		creamos la visita por medio del id obtenido por el path
		Visita visita =	visitaSer.obtenerVisita(idVisita);
		
		
//		creamos una asesoria por medio de la visita
		Asesoria asesoria = new Asesoria(visita);
		
//		guardamos asesoria
		asesoriaSer.agregarAsesoria(asesoria);
		
//		listamos todas las asesorias 
		List <Asesoria> asesorias = asesoriaSer.listarAsesoria();
		

//		creamos una instacia de asesoria vacia
		Asesoria asesoriaguardada = null;
		
		
//		recorremos el listado completo de asesorias
		for(Asesoria a:asesorias) {
			System.out.println("******************** asesoria de for " + a + " ********************");
			
//			comprobamos si alguna asesoria tiene la visita guardada
			if(a.getVisita().getId()== visita.getId()) {
				System.out.println("****************************************  entro al if **************************************** ");

				
//				cuando coincida la visita con la asesoria le asignamos la 
//				asesoria a la instacia creada anteriormente
				asesoriaguardada = a;
				System.out.println("******************** asesoria que entro al if " + asesoriaguardada + "******************** ");
				
			}
				
		}
		
		
//		recorremos los cheklist para guardar las filas en la tabla cheklistAsesoria
		for(Cheklist c: lista) {
			System.out.println("cheklist de for " + c);
			
//			creamos una instacia de cheklist asesoria por cada cheklist
			CheklistAsesoria ca = new CheklistAsesoria();
			
//			convertimos el id del cheklist en string para hacer la consulta
			String idString = String.valueOf(c.getId());
			
//			pedimos el id del estado por medio de @requestparam
			String estado= datos.get(idString);
			System.out.println("estado chek en String= '" + estado + "'");
			
			
			int estadoInt;
			
//			validamos que si el estado del cheklist no fue marcado
			if(estado==null) {
//				si el estado es null lo asignamos como valor 4= no revisdo
				estadoInt = 4;				
			}else {
//				convertimos el estado en int y se lo asignamos a la variable int
				estadoInt = Integer.parseInt(estado);
				System.out.println("estado chek int= '" + estadoInt + "'");
			}
			
			
			
			
			System.out.println("cheklist-asesoria al ser creado " + ca);
			
//			agregamos el cheklist a cheklistAsesoria
			System.out.println("cheklist que vamos a agergar a cheklistAsesoria " + c);
			ca.setCheklist(c);
			System.out.println("cheklist dentro de cheklistasesoria " + ca.getChek());
			
			
			System.out.println("cheklist-asesoria despues de agregagar cheklist " + ca);
			
//			agregamos el estado del cheklist
			EstadoChek estadoChek = estadoSer.obtenerEstadoChek(estadoInt);
			System.out.println("estado del chek " + estadoChek);
			ca.setChek(estadoChek);
			System.out.println("estado de chek dentro de cheklistasesoria " + ca.getChek());
			
			
			System.out.println("cheklist-asesoria despues de agregagar estado chek " + ca);
			
//			agregamos la asesoria al chek
			System.out.println("asesoria que vamos a agregar a cheklistAsesoria " + asesoriaguardada);
			ca.setAsesoria(asesoriaguardada);
			System.out.println("asesoria dentro de cheklistAsesoria " + ca.getAsesoria());
			
			System.out.println("cheklist asesoria despues de agregar asesoria y antes de guardar antes de guardar" + ca);
			
			
			chekasesoriaSer.agregarCheklistAsesoria(ca);
			
		}
		
		
		
		
		
//		obtenemos la solicitud de visita por medio de la visita asosiada donde se realiza la aseseoria
		SolicitudVisita solicitud = solicitudSer.obtenerSolicitud(visita.getSolicitud().getId());
		
//		cambiamos el estado de la solicitud a realizada
		solicitud.setEstado(new EstadoSolicitud(3));
		
//		guardamos la edicion de la solicitud
		solicitudSer.editarSolicitud(solicitud);
		
//		traemos todas las asesorias de la tabla
		List<CheklistAsesoria> chekTodos = chekasesoriaSer.listarCheklistAsesoria();
		
//		creamos un List de ChekAsesorias para guardar solo los chek de esta asesoria
		List<CheklistAsesoria> chekAsesoria = new ArrayList<CheklistAsesoria>();
		
//		recorremos todos los cheklist de la tabla intermedia
		for (CheklistAsesoria c: chekTodos) {

//			consultamos que cheklist estan asosiados a esta asesoria
			if(c.getAsesoria().getId() ==asesoriaguardada.getId()) {
				
//				agregamos el cheklist asesoria que se relacione con la asesoria
				chekAsesoria.add(c);
				
				
			}
		}
		
		
//		creamos variable para responder con un informe
		
		int noCumple = 0;
		
		int cumple = 0;
		
		int noAplica =0;
		
		int noRevisado = 0;
		
		
//		recorremos los cheklist asociados a la asesoria 
		for(CheklistAsesoria c: chekAsesoria) {
			
//			comprobamos que cheklist esta en estado 1 = no cumple
			if (c.getChek().getId()==1) {
				noCumple ++;
			}
			
			
		}
		
//		recorremos los cheklist asociados a la asesoria 
		for(CheklistAsesoria c: chekAsesoria) {
			
//			comprobamos que cheklist esta en estado 2 =  cumple
			if (c.getChek().getId()==2) {
				cumple ++;
			}
			
			
		}
		
//		recorremos los cheklist asociados a la asesoria 
		for(CheklistAsesoria c: chekAsesoria) {
			
//			comprobamos que cheklist esta en estado 3 = no aplica
			if (c.getChek().getId()==3) {
				noAplica ++;
			}
			
			
		}
		
//		recorremos los cheklist asociados a la asesoria 
		for(CheklistAsesoria c: chekAsesoria) {
			
//			comprobamos que cheklist esta en estado 4 = no revisado
			if (c.getChek().getId()==4) {
				noRevisado ++;
			}
			
			
		}
		
		
		
		m.addAttribute("chekAsesoria", chekAsesoria);
		
		m.addAttribute("noCumple", noCumple);
		
		m.addAttribute("cumple", cumple);
		
		m.addAttribute("noAplica", noAplica);
		
		m.addAttribute("noRevisado", noRevisado);
		
		
		
		return"DesplegarResultadoAsesoria";

	}
	
	
	
	
	
	@GetMapping("ingresarAsesoria/{i}/index")
	public String volverAInicio(@PathVariable int i ) {
		return "redirect:/index";
	}
	
	
}
