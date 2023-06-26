package com.crud.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Puesto")
public class Puesto {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String Nombre_puesto;
		public Puesto(){
			
		}
		public Puesto(int id, String nombre_puesto) {
			super();
			this.id = id;
			Nombre_puesto = nombre_puesto;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre_puesto() {
			return Nombre_puesto;
		}
		public void setNombre_puesto(String nombre_puesto) {
			Nombre_puesto = nombre_puesto;
		}
		
}
