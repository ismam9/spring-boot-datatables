package com.mine.springboot.datatables.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EmpleadoController {
	
	@GetMapping({"/"})
	public String listar(Model model) {
		
		return "empleados";
	}
}
