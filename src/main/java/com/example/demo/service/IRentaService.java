package com.example.demo.service;

import java.math.BigDecimal;

public interface IRentaService {
	
	public void realizarRenta(String placa, String cedula, BigDecimal numeroDias, String tarjeta);

}
