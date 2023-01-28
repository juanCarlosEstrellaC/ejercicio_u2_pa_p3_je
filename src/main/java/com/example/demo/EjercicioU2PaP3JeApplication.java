package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Cliente;
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
				
		BigDecimal numDias = new BigDecimal(5);
		String numTarjeta = "98765";
		
		Automovil miAuto = new Automovil();
		miAuto.setPlaca("1234");
		miAuto.setValorPorDia(new BigDecimal(100));
		//this.iAutomovilService.guardar(miAuto);
		
		Cliente miCliente = new Cliente();
		miCliente.setCedula("1234567");
		miCliente.setNombre("Juan");
		//this.iClienteService.guardar(miCliente);
		
		
		this.iRentaService.realizarRenta(miAuto.getPlaca(), miCliente.getCedula(), numDias, numTarjeta);
		
		
		//Buscar por placa un automovil y por cédula un cliente:
		Automovil autoBuscado = this.iAutomovilService.buscar("1234");
		System.out.println(autoBuscado);
		Cliente clienteBuscado = this.iClienteService.buscar("1234567");
		System.out.println(clienteBuscado);
		
		//Borrar renta y pago en una sola operación:
		
	}

}
