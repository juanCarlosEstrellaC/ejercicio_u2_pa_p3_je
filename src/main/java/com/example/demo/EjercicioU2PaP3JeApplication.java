package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Renta;
import com.example.demo.service.IAutomovilService;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IRentaService;

@SpringBootApplication
public class EjercicioU2PaP3JeApplication implements CommandLineRunner{

	@Autowired
	private IAutomovilService iAutomovilService;
	
	@Autowired
	private IClienteService iClienteService;
	
	@Autowired
	private IRentaService iRentaService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU2PaP3JeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//a donde pk en oneto one******************
		
		BigDecimal numDias = new BigDecimal(5);
		String numTarjeta = "98765";
		
		Automovil miAuto = new Automovil();
		miAuto.setPlaca("123");
		miAuto.setValorPorDia(new BigDecimal(100));
		
		this.iAutomovilService.guardar(miAuto);
		
		Cliente miCliente = new Cliente();
		miCliente.setCedula("123456");
		miCliente.setNombre("Juan");
		
		this.iClienteService.guardar(miCliente);
		
		
		this.iRentaService.realizarRenta(miAuto.getPlaca(), miCliente.getCedula(), numDias, numTarjeta);
		
	}

}
