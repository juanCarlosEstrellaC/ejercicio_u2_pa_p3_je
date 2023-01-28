package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private IClienteRepository iClienteRepository;

	@Override
	public void guardar(Cliente cliente) {
		this.iClienteRepository.insertar(cliente);
	}

	@Override
	public Cliente buscar(String id) {
		return this.iClienteRepository.buscar(id);
	}

}
