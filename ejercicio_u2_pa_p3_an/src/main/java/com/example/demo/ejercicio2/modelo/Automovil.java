package com.example.demo.ejercicio2.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "auto")
public class Automovil {
	@Id
	@Column(name = "auto_placa")
	private String placa;
	@Column(name = "auto_valor_por_dia")
	private BigDecimal valorPorDia;
	
	@OneToMany(mappedBy = "auto", cascade = CascadeType.ALL)
	private List<Renta>  rentasA;
	
	//GET Y SET
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public BigDecimal getValorPorDia() {
		return valorPorDia;
	}
	public void setValorPorDia(BigDecimal valorPorDia) {
		this.valorPorDia = valorPorDia;
	}
	public List<Renta> getRentasA() {
		return rentasA;
	}
	public void setRentasA(List<Renta> rentasA) {
		this.rentasA = rentasA;
	}
	@Override
	public String toString() {
		return "Automovil [placa=" + placa + ", valorPorDia=" + valorPorDia + ", rentasA=" + rentasA + "]";
	}
	
	
	
}
