package com.crud.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import com.crud.demo.modelo.VisitasClientes;
import com.crud.demo.serviceInterface.IVisitasClientesService;

@Controller
@RequestMapping
@CrossOrigin
public class ControladorVisitasCLientes {

	@Autowired
	private IVisitasClientesService service;
	
	@GetMapping("/listarc")
	public String listarc(Model model) {
		model.addAttribute("VisitasCliente", service.listar());
		return "index3";
	}
	@GetMapping("/listarc/{id}")
	public String listarId(@PathVariable int id, Model model) {
		model.addAttribute("VisitasClientes", service.ListarId(id));
		return "form3";
	}
	
	@GetMapping("/newc")
	public String nuevo3(Model model) {
		model.addAttribute("VisitasClientes", new VisitasClientes());
		return "form3";
	}
	
	@PostMapping("/save3")
	public String save3(@Validated VisitasClientes p,Model model) {
		int id=service.save(p);
		if(id==0) {
			return "form3";
		}
		return "redirect:/listarc";
	}
	
	@GetMapping("/deletec/{id}")
	public String eliminarc(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listarc";
	}
	
	
}
