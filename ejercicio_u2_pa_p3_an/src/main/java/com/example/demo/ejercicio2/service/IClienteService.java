package com.example.demo.ejercicio2.service;

import com.example.demo.ejercicio2.modelo.Cliente;

public interface IClienteService {
	public void crear(Cliente cliente);
	public void modificar(Cliente cliente);
	public Cliente buscar(String cedula);
	public void borrar(String cedula);
}
