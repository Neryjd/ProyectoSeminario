package com.crud.demo.serviceInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.crud.demo.modelo.Empleado;


public interface IEmpleadoService {
	public List<Empleado> listar();

	public Optional<Empleado> listarId(int id);

	public int save(Empleado p);

	public void delete(int id);
}
