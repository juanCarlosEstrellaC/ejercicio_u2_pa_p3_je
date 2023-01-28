package com.example.demo.repository;

import com.example.demo.modelo.Cliente;

public interface IClienteRepository {
	
	public void insertar(Cliente cliente);
	public Cliente buscar(String id);


}
