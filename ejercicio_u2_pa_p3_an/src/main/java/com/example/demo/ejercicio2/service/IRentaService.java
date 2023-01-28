package com.example.demo.ejercicio2.service;

import java.math.BigDecimal;

import com.example.demo.ejercicio2.modelo.Renta;

public interface IRentaService {
	public void realizar(String placa, String cedula, Integer numDias, Integer numTarjeta);
	public void modificar(Renta renta);
	public Renta buscar(Integer id);
	public void borrar(Integer id);
	public BigDecimal calcularValor(String placa, Integer numDias);
}
