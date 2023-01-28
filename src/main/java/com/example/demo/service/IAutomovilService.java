package com.example.demo.service;

import com.example.demo.modelo.Automovil;

public interface IAutomovilService {
	
	public void guardar(Automovil automovil);
	public Automovil buscar(String id);

}
