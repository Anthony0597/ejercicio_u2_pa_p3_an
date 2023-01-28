package com.example.demo.ejercicio2.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "renta")
public class Renta {
	
	@Id
	@SequenceGenerator(name="rent_seq",sequenceName = "rent_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rent_seq")
	@Column(name = "rent_id")
	private Integer id;
	@Column(name = "rent_fecha")
	private LocalDateTime fecha;
	@Column(name = "rent_nemero_dias")
	private Integer numeroDias;
	@Column(name = "rent_valor")
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name = "rent_id_auto")
	private Automovil auto;
	
	@ManyToOne
	@JoinColumn(name = "rent_id_cliente")
	private Cliente cliente;
	
	@OneToOne
	@JoinColumn(name = "rent_id_pago")
	private Pago pago;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Integer getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(Integer numeroDias) {
		this.numeroDias = numeroDias;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Automovil getAuto() {
		return auto;
	}

	public void setAuto(Automovil auto) {
		this.auto = auto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	@Override
	public String toString() {
		return "Renta [id=" + id + ", fecha=" + fecha + ", numeroDias=" + numeroDias + ", valor=" + valor + ", auto="
				+ auto + ", cliente=" + cliente + ", pago=" + pago + "]";
	}

	
	
}
