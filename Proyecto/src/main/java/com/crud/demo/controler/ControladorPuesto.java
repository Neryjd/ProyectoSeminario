package com.crud.demo.controler;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.crud.demo.modelo.Puesto;
import com.crud.demo.serviceInterface.IPuestoService;

@Controller
@RequestMapping
@CrossOrigin
public class ControladorPuesto {

	@Autowired
	private IPuestoService service;
	
	@GetMapping("/listarp")
	public String listar(Model model) {
		model.addAttribute("puesto", service.listar());
		return "index2";
	}
	@GetMapping("/listarp/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("puesto", service.listarId(id));
		return "form2";
	}
	
	@GetMapping("/newp")
	public String nuevo2(Model model) {
		model.addAttribute("puesto", new Puesto());
		return "form2";
	}
	
	@PostMapping("/save2")
	public String save2(@Validated Puesto p,Model model) {
		int id=service.save(p);
		if(id==0) {
			return "form2";
		}
		return "redirect:/listarp";
	}
	
	@GetMapping("/delete2/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listarp";
	}
	
}
