package com.mine.springboot.datatables.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mine.springboot.datatables.app.models.entity.Empleado;
import com.mine.springboot.datatables.app.models.services.IEmpleadoServices;

@RestController
public class EmpleadoRestController {
	
	@Autowired
	private IEmpleadoServices empleadoService;
	
	@RequestMapping(value = "/empleados", method=RequestMethod.GET)
	public List<Empleado> getAllEmpleados(){
		return empleadoService.getAllEmpleados();
	}
    @RequestMapping(value = "/empleados/{id}", method = RequestMethod.GET)
	public Empleado getEmpleadoById(@PathVariable("id") long id){
		return empleadoService.getEmpleadoById(id);
	}
}
