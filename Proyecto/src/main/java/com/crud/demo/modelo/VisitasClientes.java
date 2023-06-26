package com.crud.demo.modelo;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "VisitasClientes")
public class VisitasClientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int id_cliente;
	private int id_empleado;
	private String Fecha_visita;
	private String Estado_visita;
	private String Departamento;
	private String Zona_visita;
	private float Latitud;
	private float Longitud;
	private String Tipo_Servicio;
	public VisitasClientes(){	
	}
	public VisitasClientes(int id, int id_cliente, int id_empleado, String fecha_visita, String estado_visita,
			String departamento, String zona_visita, float latitud, float longitud, String tipo_Servicio) {
		super();
		this.id = id;
		this.id_cliente = id_cliente;
		this.id_empleado = id_empleado;
		Fecha_visita = fecha_visita;
		Estado_visita = estado_visita;
		Departamento = departamento;
		Zona_visita = zona_visita;
		Latitud = latitud;
		Longitud = longitud;
		Tipo_Servicio = tipo_Servicio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}
	public String getFecha_visita() {
		return Fecha_visita;
	}
	public void setFecha_visita(String fecha_visita) {
		Fecha_visita = fecha_visita;
	}
	public String getEstado_visita() {
		return Estado_visita;
	}
	public void setEstado_visita(String estado_visita) {
		Estado_visita = estado_visita;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	public String getZona_visita() {
		return Zona_visita;
	}
	public void setZona_visita(String zona_visita) {
		Zona_visita = zona_visita;
	}
	public float getLatitud() {
		return Latitud;
	}
	public void setLatitud(float latitud) {
		Latitud = latitud;
	}
	public float getLongitud() {
		return Longitud;
	}
	public void setLongitud(float longitud) {
		Longitud = longitud;
	}
	public String getTipo_Servicio() {
		return Tipo_Servicio;
	}
	public void setTipo_Servicio(String tipo_Servicio) {
		Tipo_Servicio = tipo_Servicio;
	}
	
}
