package com.crud.demo.serviceInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.crud.demo.modelo.Puesto;


public interface IPuestoService {
	public List<Puesto> listar();

	public Optional<Puesto> listarId(int id);

	public int save(Puesto p);

	public void delete(int id);
}
