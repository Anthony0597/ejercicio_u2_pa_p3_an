package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio2.modelo.Automovil;
import com.example.demo.ejercicio2.modelo.Cliente;
import com.example.demo.ejercicio2.modelo.Pago;
import com.example.demo.ejercicio2.modelo.Renta;
import com.example.demo.ejercicio2.service.IAutomovilService;
import com.example.demo.ejercicio2.service.IClienteService;
import com.example.demo.ejercicio2.service.IRentaService;

@SpringBootApplication
public class EjercicioU2PaP3AnApplication implements CommandLineRunner{

	@Autowired
	private IAutomovilService automovilService;
	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IRentaService rentaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU2PaP3AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Automovil auto = new Automovil();
		auto.setPlaca("PDF-4587");
		auto.setValorPorDia(new BigDecimal(30));
		
		Cliente clie = new Cliente();
		clie.setNombre("Anthony");
		clie.setCedula("13468754");
		
		List<Renta> rentas = new ArrayList<>();
		
		
		Renta renta = new Renta();
		renta.setAuto(auto);
		renta.setCliente(clie);
		renta.setNumeroDias(5);
		
		Pago pago = new Pago();
		pago.setNumeroTarjeta(156876541);
		pago.setValor(this.rentaService.calcularValor(auto.getPlaca(), renta.getNumeroDias()));
		
		renta.setPago(pago);
		pago.setRenta(renta);
		
		rentas.add(renta);
		
		auto.setRentasA(rentas);
		clie.setRentasC(rentas);
		
		this.automovilService.guardar(auto);
		this.clienteService.crear(clie);
		
		this.rentaService.realizar(auto.getPlaca(), clie.getCedula(), renta.getNumeroDias(), pago.getNumeroTarjeta());
	}

}
