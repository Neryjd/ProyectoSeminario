package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.crud.demo.modelo.Puesto;
import com.crud.demo.modeloDAO.IPuesto;
import com.crud.demo.serviceInterface.IPuestoService;

@Service
public class PuestoService implements IPuestoService{

	@Autowired
	private IPuesto data;

	@Override
	public List<Puesto> listar() {

		return (List<Puesto>)data.findAll();
	}

	@Override
	public Optional<Puesto> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Puesto p) {
		int res=0;
		Puesto puesto=data.save(p);
		if(!puesto.equals(null)) {
			res=1;
	}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}
	
}
