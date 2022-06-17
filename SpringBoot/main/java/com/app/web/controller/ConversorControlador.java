package com.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.app.web.model.Operador;
import com.app.web.services.MonedaServicio;

@Controller
public class ConversorControlador {

	@Autowired
	private MonedaServicio servicio;
	
	@GetMapping("/conversor")
	public String mostrarMonedas(Model model) {
		model.addAttribute("monedas",this.servicio.getAll());
		model.addAttribute("operador", new Operador());
		return "conversor";
	}
	
	@PostMapping("/conversor")
	public String calculaConversion(@ModelAttribute Operador operador, Model model) {
		model.addAttribute("monedas",this.servicio.getAll());
		model.addAttribute("operador", new Operador());
		model.addAttribute("resultado",operador.getCantidadEuro()*operador.getMoneda().getValor());
		return "conversor";
	}
	
}
