package com.crud.demo.modeloDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.modelo.Puesto;
@Repository
public interface IPuesto extends CrudRepository<Puesto, Integer> {

}
