package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "automovil")
public class Automovil {
	
	@Id
	@Column(name = "auto_placa")
	private String placa;
	
	@Column(name = "auto_valorPorDia")
	private BigDecimal valorPorDia;
	
	@OneToMany(mappedBy = "miAutomovil", cascade = CascadeType.ALL)
	private List<Renta> miListaRentaAuto;

	//toString
	@Override
	public String toString() {
		return "Automovil [placa=" + placa + ", valorPorDia=" + valorPorDia + ", miListaRentaAuto=" + miListaRentaAuto
				+ "]";
	}

	//Get y Set
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public BigDecimal getValorPorDia() {
		return valorPorDia;
	}

	public void setValorPorDia(BigDecimal valorPorDia) {
		this.valorPorDia = valorPorDia;
	}

	public List<Renta> getMiListaRentaAuto() {
		return miListaRentaAuto;
	}

	public void setMiListaRentaAuto(List<Renta> miListaRentaAuto) {
		this.miListaRentaAuto = miListaRentaAuto;
	}


	
	

}
