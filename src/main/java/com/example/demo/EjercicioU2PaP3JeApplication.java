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
	//1. Creo e inserto un Automovil y un Cliente:
		Automovil miAuto = new Automovil();
		miAuto.setPlaca("AAA-525");
		miAuto.setValorPorDia(new BigDecimal(100));
//		this.iAutomovilService.guardar(miAuto);
		
		Cliente miCliente = new Cliente();
		miCliente.setCedula("2256489-2");
		miCliente.setNombre("Rauw Alejandro");
//		this.iClienteService.guardar(miCliente);
		
	// 2. Realizo una Renta:
//		this.iRentaService.realizarRenta(miAuto.getPlaca(), miCliente.getCedula(), new BigDecimal(5), "98765");
		
		
	// 3. Buscar por placa un automovil y por cédula un cliente:
		
		// 	3.1. Me pide que imprima todo el objeto buscado. Para imprimir las referencias de otras tablas asociadas a dicho objeto,
		//       usaré en los parámetros de la anotación el fetch = FetchType.EAGER.
		//  3.2. En uno de las dos clases que voy a imprimir el objeto, quito del toString la lista de Rentas, para evitar el stack overflow.
		
//		Automovil autoBuscado = this.iAutomovilService.buscar("AAA-525");
//		System.out.println(autoBuscado);
//		Cliente clienteBuscado = this.iClienteService.buscar("2256489-2");
//		System.out.println(clienteBuscado);
	
	// 4. Borrar renta y pago en una sola operación:
		// Para hacer esta jugada, debo colocar de ley en las anotaciones de Cliente y Automovil el cascade.Remove, ya que si no lo hago, al
		// querer eliminar una Renta, no podré hacerlo, puesto que necesito eliminar también los valores en las tablas originales. 
//		this.iRentaService.borrar(3);
		
	}

}
