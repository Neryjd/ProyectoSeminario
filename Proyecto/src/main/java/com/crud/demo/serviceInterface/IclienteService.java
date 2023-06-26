package com.crud.demo.serviceInterface;
import java.util.List;
import java.util.Optional;

import com.crud.demo.modelo.Cliente;


public interface IclienteService {
 public List<Cliente>listar();
 public Optional<Cliente>listarId(int id);
 public int save(Cliente p);
 public void delete(int id);
}
