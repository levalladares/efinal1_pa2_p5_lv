package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{

	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(transferencia);
	}

	@Override
	public List<Transferencia> mostrarTodas() {
		// TODO Auto-generated method stub
		TypedQuery<Transferencia> myQuery = this.entityManager.createQuery("SELECT t FROM Transferencia t" , Transferencia.class);
		return myQuery.getResultList();
	}

}
