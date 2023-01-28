package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "automovilRent")
public class Automovil {
	
	@Id
	@Column(name = "auto_placa")
	private String placa;
	
	@Column(name = "auto_valorPorDia")
	private BigDecimal valorPorDia;
	
	@OneToMany(mappedBy = "miAutomovil", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Renta> miListaRentaAuto;

	//toString quitado la lista de Rentas para que no haya stack overflow:
	@Override
	public String toString() {
		return "Automovil [placa=" + placa + ", valorPorDia=" + valorPorDia + "]";
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
