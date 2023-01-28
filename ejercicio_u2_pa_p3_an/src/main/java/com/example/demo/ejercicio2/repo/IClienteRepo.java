package com.example.demo.ejercicio2.repo;

import com.example.demo.ejercicio2.modelo.Cliente;

public interface IClienteRepo {
	public void insertar(Cliente cliente);
	public void actualizar(Cliente cliente);
	public Cliente buscar(String cedula);
	public void eliminar(String cedula);
}
