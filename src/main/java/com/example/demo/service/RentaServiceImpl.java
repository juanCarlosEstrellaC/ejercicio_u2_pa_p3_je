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
import com.example.demo.repository.IRentaRepository;

@Service
public class RentaServiceImpl implements IRentaService {

	@Autowired
	private IRentaRepository iRentaRepository;
	
	@Autowired
	private IClienteRepository iClienteRepository;
	
	@Autowired
	private IAutomovilRepository iAutomovilRepository;
	
	@Override
	public void realizarRenta(String placa, String cedula, BigDecimal numeroDias, String tarjeta) {
		
		Cliente cliente = this.iClienteRepository.buscar(cedula);
		Automovil automovil = this.iAutomovilRepository.buscar(placa);

		List<Renta> miListaRentas = new ArrayList<Renta>();
			Renta renta1 = new Renta();
			renta1.setFecha(LocalDateTime.now());
			renta1.setNumeroDias(numeroDias);
			renta1.setValorPago(new BigDecimal(2.50).multiply(renta1.getNumeroDias()));
			renta1.setMiAutomovil(automovil);
			renta1.setMiCliente(cliente);
			
				Pago pago = new Pago();
				pago.setNumeroTarjeta(tarjeta);
				pago.setValorPago(renta1.getValorPago().add(renta1.getValorPago().multiply(new BigDecimal(0.05))));
				//pago.setMiRenta(renta1);
			renta1.setMiPago(pago);
			miListaRentas.add(renta1);
		
		cliente.setMilistaRentasClie(miListaRentas);
		automovil.setMiListaRentaAuto(miListaRentas);
		
		this.iRentaRepository.insertar(renta1);
		
		
	}

}
