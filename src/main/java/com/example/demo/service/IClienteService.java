package com.example.demo.service;

import com.example.demo.modelo.Cliente;

public interface IClienteService {
	
	public void guardar(Cliente cliente);
	public Cliente buscar(String id);

}
