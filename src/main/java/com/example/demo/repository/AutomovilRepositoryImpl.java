package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutomovilRepositoryImpl implements IAutomovilRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Automovil automovil) {
		this.entityManager.persist(automovil);
	}

	@Override
	public Automovil buscar(String id) {
		return this.entityManager.find(Automovil.class, id);
	}

}
