package com.example.demo.ejercicio2.service;

import com.example.demo.ejercicio2.modelo.Automovil;

public interface IAutomovilService {
	public void guardar(Automovil automovil);
	public void modificar(Automovil automovil);
	public Automovil buscar(String placa);
	public void borrar(String placa);
}
