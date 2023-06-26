package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.modelo.Cliente;
import com.crud.demo.modeloDAO.Icliente;
import com.crud.demo.serviceInterface.IclienteService;



@Service
public class ClienteService implements IclienteService {
   @Autowired
	private Icliente data;

@Override
public List<Cliente> listar() {
	// TODO Auto-generated method stub
return (List<Cliente>)data.findAll();
}

@Override
public Optional<Cliente> listarId(int id) {
	return data.findById(id);
}

@Override
public int save(Cliente p) {
	int res=0;
	Cliente cliente=data.save(p);
	if(!cliente.equals(null)) {
		res=1;
}
	return res;
}

@Override
public void delete(int id) {
	data.deleteById(id);
	
}

	
	
	
}
