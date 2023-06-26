package com.crud.demo.controler;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.crud.demo.modelo.Empleado;
import com.crud.demo.serviceInterface.IEmpleadoService;



@Controller
@RequestMapping
@CrossOrigin
public class ControladorEmpleado {
	@Autowired
	private IEmpleadoService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("empleados", service.listar());
		return "index0";
	}
	@GetMapping("/listar/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("empleado", service.listarId(id));
		return "form0";
	}
	
	@GetMapping("/new")
	public String nuevo(Model model) {
		model.addAttribute("empleado", new Empleado());
		return "form0";
	}
	
	@PostMapping("/save")
	public String save(@Validated Empleado p,Model model) {
		int id=service.save(p);
		if(id==0) {
			return "form0";
		}
		return "redirect:/listar";
	}
	
	@GetMapping("/delete/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listar";
	}
	
}
