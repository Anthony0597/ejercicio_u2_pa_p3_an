package com.example.demo.ejercicio2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio2.modelo.Automovil;
import com.example.demo.ejercicio2.repo.IAutomovilRepo;

@Service
public class AutomovilServiceImpl implements IAutomovilService {

	@Autowired
	private IAutomovilRepo automovilRepo;
	
	@Override
	public void guardar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.automovilRepo.insertar(automovil);
	}

	@Override
	public void modificar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.automovilRepo.actualizar(automovil);
	}

	@Override
	public Automovil buscar(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscar(placa);
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		this.automovilRepo.eliminar(placa);
	}

}
