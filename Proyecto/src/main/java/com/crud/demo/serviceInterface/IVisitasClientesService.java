package com.crud.demo.serviceInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.crud.demo.modelo.VisitasClientes;


public interface IVisitasClientesService {
 public List<VisitasClientes> listar();
 public Optional<VisitasClientes> ListarId(int id);
 public int save(VisitasClientes p);
 public void delete(int id);
}
