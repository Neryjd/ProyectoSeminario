package com.crud.demo.modeloDAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.modelo.VisitasClientes;

@Repository
public interface IVisitasClientes extends CrudRepository<VisitasClientes,Integer> {

}
