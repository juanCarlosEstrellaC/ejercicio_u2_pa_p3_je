package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Pago;
import com.example.demo.modelo.Renta;
import com.example.demo.repository.IAutomovilRepository;
import com.example.demo.repository.IClienteRepository;

@Service
public class RentaServiceImpl implements IRentaService {

	@Autowired
	private IAutomovilRepository iAutomovilRepository;
	
	@Autowired
	private IClienteRepository iClienteRepository;
	
	@Override
	public void realizarRenta(String placa, String cedula, BigDecimal numeroDias, String tarjeta) {
		
		Automovil auto = this.iAutomovilRepository.buscar(placa);
		Cliente cliente = this.iClienteRepository.buscar(cedula);
		
		Pago pago = new Pago();
		pago.setNumeroTarjeta(tarjeta);
		
		
		List<Renta> miListaRentas = new ArrayList<Renta>();
			Renta miRenta = new Renta();
			miRenta.setFecha(LocalDateTime.now());
			miRenta.setNumeroDias(numeroDias);
			miRenta.setValorPago(new BigDecimal(15));
			//miRenta.setValorPago(new BigDecimal(numeroDias.multiply(numeroDias)));
		miListaRentas.add(miRenta);
		
		pago.setMiRenta(miRenta);

		
	}

}
