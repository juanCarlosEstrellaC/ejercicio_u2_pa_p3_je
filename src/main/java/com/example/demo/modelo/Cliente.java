package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@Column(name = "clie_cedula")
	private String cedula;
	
	@Column(name = "clie_nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "miCliente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Renta> milistaRentasClie;

	//toString:
	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", milistaRentasClie=" + milistaRentasClie + "]";
	}

	//Get y Set
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Renta> getMilistaRentasClie() {
		return milistaRentasClie;
	}

	public void setMilistaRentasClie(List<Renta> milistaRentasClie) {
		this.milistaRentasClie = milistaRentasClie;
	}


		
	
	
	

}
