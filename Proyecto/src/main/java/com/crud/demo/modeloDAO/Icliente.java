package com.crud.demo.modeloDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.modelo.Cliente;



@Repository
public interface Icliente extends CrudRepository<Cliente, Integer> {

}
