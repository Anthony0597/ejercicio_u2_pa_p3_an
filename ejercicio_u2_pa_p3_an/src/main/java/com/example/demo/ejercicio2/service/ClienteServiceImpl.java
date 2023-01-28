package com.example.demo.ejercicio2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio2.modelo.Cliente;
import com.example.demo.ejercicio2.repo.IClienteRepo;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepo clienteRepo;
	
	@Override
	public void crear(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.insertar(cliente);
	}

	@Override
	public void modificar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.actualizar(cliente);
	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscar(cedula);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.clienteRepo.eliminar(cedula);
	}

}
