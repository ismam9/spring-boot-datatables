package com.mine.springboot.datatables.app.models.services;

import java.util.List;

import com.mine.springboot.datatables.app.models.entity.Empleado;

public interface IEmpleadoServices {
	
	public List<Empleado> getAllEmpleados();
	public Empleado getEmpleadoById(Long id);

}
