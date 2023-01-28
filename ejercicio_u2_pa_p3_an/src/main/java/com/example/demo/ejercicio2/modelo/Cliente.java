package com.example.demo.ejercicio2.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@Column(name = "clie_cedula")
	private String cedula;
	@Column(name = "clie_nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Renta> rentasC;
	
	//SET Y GET

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Renta> getRentasC() {
		return rentasC;
	}

	public void setRentasC(List<Renta> rentasC) {
		this.rentasC = rentasC;
	}

	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", rentasC=" + rentasC + "]";
	}
	
	
	
}
