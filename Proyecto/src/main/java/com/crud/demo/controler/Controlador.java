package com.crud.demo.controler;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.crud.demo.modelo.Cliente;
import com.crud.demo.serviceInterface.IclienteService;



@Controller
@RequestMapping
@CrossOrigin
public class Controlador {
 @Autowired
	private IclienteService service;
    
 @GetMapping("/lista")
	public String lista(Model model) {
	 model.addAttribute("clientes", service.listar());
		return"index1";
 }
 @GetMapping("/lista/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("cliente", service.listarId(id));
		return "form1";
	}
	
	@GetMapping("/new1")
	public String nuevo1(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "form1";
	}
	
	@PostMapping("/save1")
	public String save1(@Validated Cliente p,Model model) {
		int id=service.save(p);
		if(id==0) {
			return "form1";
		}
		return "redirect:/lista";
	}
	
	@GetMapping("/delete1/{id}")
	public String eliminar1(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/lista";
	}
 
 
}
