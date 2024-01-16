package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bancaria);
	}

	@Override
	public CuentaBancaria seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaBancaria.class, id);
	}

	@Override
	public void actualizar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(bancaria);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		CuentaBancaria c1 = this.seleccionar(id);
		this.entityManager.remove(c1);
	}

	@Override
	public CuentaBancaria seleccionarPorNumero(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<CuentaBancaria> myQuery = this.entityManager.createQuery("SELECT c FROM CuentaBancaria c WHERE c.numero = :variable", CuentaBancaria.class);
		myQuery.setParameter("variable", numero);
		return myQuery.getSingleResult();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
