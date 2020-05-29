package com.mine.springboot.datatables.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mine.springboot.datatables.app.models.dao.IEmpleadoDao;
import com.mine.springboot.datatables.app.models.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoServices{
	
	@Autowired
	private IEmpleadoDao empleadoDao;
	
	@Override
	public List<Empleado> getAllEmpleados() {
		// TODO Auto-generated method stub
		return (List<Empleado>) empleadoDao.findAll();
	}

	@Override
	public Empleado getEmpleadoById(Long id) {
		// TODO Auto-generated method stub
		return empleadoDao.findById(id).orElse(null);
	}

}
