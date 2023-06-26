package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.crud.demo.modelo.VisitasClientes;
import com.crud.demo.modeloDAO.IVisitasClientes;
import com.crud.demo.serviceInterface.IVisitasClientesService;

@Service
public class VisitasClientesService implements IVisitasClientesService {

	@Autowired
	private IVisitasClientes data;

	@Override
	public List<VisitasClientes> listar() {
		// TODO Auto-generated method stub
		return (List<VisitasClientes>)data.findAll();
	}

	@Override
	public Optional<VisitasClientes> ListarId(int id) {
		// TODO Auto-generated method stub
		return  data.findById(id);
	}

	@Override
	public int save(VisitasClientes p) {
		int res=0;
		VisitasClientes VisitasClientes=data.save(p);
		if(!VisitasClientes.equals(null)) {
			res=1;
	}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

}
