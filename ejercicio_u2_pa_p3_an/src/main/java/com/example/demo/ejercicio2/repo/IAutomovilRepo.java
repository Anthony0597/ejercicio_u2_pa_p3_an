package com.example.demo.ejercicio2.repo;

import com.example.demo.ejercicio2.modelo.Automovil;

public interface IAutomovilRepo {
	public void insertar(Automovil automovil);
	public void actualizar(Automovil automovil);
	public Automovil buscar(String placa);
	public void eliminar(String placa);
}
