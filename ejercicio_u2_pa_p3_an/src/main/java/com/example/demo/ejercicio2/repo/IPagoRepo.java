package com.example.demo.ejercicio2.repo;

import com.example.demo.ejercicio2.modelo.Pago;

public interface IPagoRepo {
	public void insertar(Pago pago);
	public void actualizar(Pago pago);
	public Pago buscar(Integer id);
	public Pago buscarNumT(Integer numeroTarjeta);
	public void eliminar(Integer id);
}
