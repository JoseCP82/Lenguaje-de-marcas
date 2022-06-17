package com.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.web.model.Moneda;
import com.app.web.services.MonedaServicio;

@Controller
@RequestMapping("/")
public class MonedaControlador {

	@Autowired
	private MonedaServicio servicio;
	
	@GetMapping("/monedas")
	public String mostrarMonedas(Model model) {
		model.addAttribute("monedas",this.servicio.getAll());
		return "monedas";
	}
	
	@GetMapping("/monedas/nuevo")
	public String formularioMonedaNueva(Model model) {
		Moneda moneda = new Moneda();
		model.addAttribute("moneda",moneda);
		return "formulario_moneda_nueva";
	}
	
	@PostMapping("/monedas")
	public String insertarMoneda(@ModelAttribute("moneda") Moneda moneda) {
		servicio.insert(moneda);
		return "redirect:/monedas";
	}
	
	@GetMapping("/monedas/editar/{id}")
	public String formularioMonedaEditar(@PathVariable int id, Model model) {
		model.addAttribute("moneda",servicio.get(id));		
		return "editar_moneda";
	}
	
	@PostMapping("/monedas/{id}")
	public String actualizaMoneda(@PathVariable int id, @ModelAttribute("moneda") Moneda moneda) {
		Moneda monedaAux = servicio.get(id);
		monedaAux.setId(id);
		monedaAux.setNombre(moneda.getNombre());
		monedaAux.setValor(moneda.getValor());
		servicio.update(monedaAux);
		return "redirect:/monedas";
	}
	
	@GetMapping("/monedas/{id}")
	public String eliminaMoneda(@PathVariable int id, RedirectAttributes redirectAtt) {
		servicio.delete(id);
		redirectAtt.addFlashAttribute("mensaje","Moneda eliminada");
		redirectAtt.addFlashAttribute("clase","success");
		return "redirect:/monedas";
	}
}
