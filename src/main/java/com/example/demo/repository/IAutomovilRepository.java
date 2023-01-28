package com.example.demo.repository;

import com.example.demo.modelo.Automovil;

public interface IAutomovilRepository {
	
	public void insertar(Automovil automovil);
	public Automovil buscar(String id);

}
