package com.example.demo.ejercicio2.service;

import com.example.demo.ejercicio2.modelo.Pago;

public interface IPagoService {
	public void guardar(Pago pago);
	public Pago buscar(Integer id);
	public Pago buscarNumT(Integer numeroTarjeta);
}
