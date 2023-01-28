package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
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
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "renta_seq")
	@SequenceGenerator(name = "renta_seq", sequenceName = "renta_seq", allocationSize = 1)
	@Column(name = "renta_id")
	private Integer id;
	
	@Column(name = "renta_fecha")
	private LocalDateTime fecha;
	
	@Column(name = "renta_numeroDias")
	private BigDecimal numeroDias;
	
	@Column(name = "renta_valorPago")
	private BigDecimal valorPago;
	
	@ManyToOne//(cascade = CascadeType.ALL)
	@JoinColumn(name = "renta_id_miAutomovil")
	private Automovil miAutomovil;

	@ManyToOne//(cascade = CascadeType.ALL)
	@JoinColumn(name = "renta_id_miCliente")
	private Cliente miCliente;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "renta_id_miPago")
	private Pago miPago;
	
	//toString:
	@Override
	public String toString() {
		return "Renta [id=" + id + ", fecha=" + fecha + ", numeroDias=" + numeroDias + ", valorPago=" + valorPago
				+ ", miAutomovil=" + miAutomovil + "]";
	}

	//Get y Set
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


	public BigDecimal getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(BigDecimal numeroDias) {
		this.numeroDias = numeroDias;
	}

	public Cliente getMiCliente() {
		return miCliente;
	}

	public void setMiCliente(Cliente miCliente) {
		this.miCliente = miCliente;
	}

	public Pago getMiPago() {
		return miPago;
	}

	public void setMiPago(Pago miPago) {
		this.miPago = miPago;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	public Automovil getMiAutomovil() {
		return miAutomovil;
	}

	public void setMiAutomovil(Automovil miAutomovil) {
		this.miAutomovil = miAutomovil;
	}
	
	

}
