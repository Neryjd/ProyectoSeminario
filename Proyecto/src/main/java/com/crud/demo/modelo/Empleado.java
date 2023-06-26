package com.crud.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;
private String nombres;
private int puesto;
private int telefono;
public Empleado() {
	// TODO Auto-generated constructor stub
}
public Empleado(int id, String nombres, int puesto, int telefono) {
	super();
	this.id = id;
	this.nombres = nombres;
	this.puesto = puesto;
	this.telefono = telefono;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombres() {
	return nombres;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}
public int getPuesto() {
	return puesto;
}
public void setPuesto(int puesto) {
	this.puesto = puesto;
}
public int getTelefono() {
	return telefono;
}
public void setTelefono(int telefono) {
	this.telefono = telefono;
}


}
