package com.mine.springboot.datatables.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.mine.springboot.datatables.app.models.entity.Empleado;

public interface IEmpleadoDao extends CrudRepository<Empleado, Long>{

}
