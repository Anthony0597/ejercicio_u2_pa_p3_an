package com.example.demo.ejercicio2.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio2.modelo.Renta;
import com.example.demo.ejercicio2.repo.IAutomovilRepo;
import com.example.demo.ejercicio2.repo.IClienteRepo;
import com.example.demo.ejercicio2.repo.IPagoRepo;
import com.example.demo.ejercicio2.repo.IRentaRepo;

@Service
public class RentaServiceImpl implements IRentaService {

	@Autowired
	private IRentaRepo rentaRepo;
	@Autowired
	private IClienteRepo clienteRepo;
	@Autowired
	private IAutomovilRepo automovilRepo;
	@Autowired
	private IPagoRepo pagoRepo;
	
	@Override
	public void realizar(String placa, String cedula, Integer numDias, Integer numTarjeta) {
		// TODO Auto-generated method stub
		Renta renta = new Renta();
		renta.setFecha(LocalDateTime.now());
		renta.setAuto(this.automovilRepo.buscar(placa));
		renta.setCliente(this.clienteRepo.buscar(cedula));
		renta.setNumeroDias(numDias);
		renta.setPago(this.pagoRepo.buscarNumT(numTarjeta));
		
		
		renta.setValor(this.calcularValor(placa, numDias));
		
		this.rentaRepo.insertar(renta);
	}
	
	public BigDecimal calcularValor(String placa, Integer numDias) {
		return this.automovilRepo.buscar(placa).getValorPorDia().multiply(new BigDecimal(numDias));
	}

	@Override
	public void modificar(Renta renta) {
		// TODO Auto-generated method stub
		this.rentaRepo.actualizar(renta);
	}

	@Override
	public Renta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.rentaRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.rentaRepo.eliminar(id);
	}

}
