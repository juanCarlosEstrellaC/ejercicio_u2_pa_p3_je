package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.repository.IAutomovilRepository;

@Service
public class AutomovilServiceImpl implements IAutomovilService {
	
	@Autowired
	private IAutomovilRepository iAutomovilRepository;
	
	@Override
	public void guardar(Automovil automovil) {
		this.iAutomovilRepository.insertar(automovil);
	}

	@Override
	public Automovil buscar(String id) {
		return this.iAutomovilRepository.buscar(id);
	}

}
