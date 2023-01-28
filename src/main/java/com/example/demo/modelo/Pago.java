package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pago_seq")
	@SequenceGenerator(name = "pago_seq", sequenceName = "pago_seq", allocationSize = 1)
	@Column(name = "pago_id")
	private Integer id;
	
	@Column(name = "pago_numeroTarjeta")
	private String numeroTarjeta;

	@Column(name = "pago_valorPago")
	private BigDecimal valorPago;
	
	@OneToOne(mappedBy = "miPago")
	private Renta miRenta;

	//toString:
	@Override
	public String toString() {
		return "Pago [id=" + id + ", numeroTarjeta=" + numeroTarjeta + ", valorPago=" + valorPago + ", miRenta="
				+ miRenta + "]";
	}
	
	//Get y Set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	public Renta getMiRenta() {
		return miRenta;
	}

	public void setMiRenta(Renta miRenta) {
		this.miRenta = miRenta;
	}
	

	
}
