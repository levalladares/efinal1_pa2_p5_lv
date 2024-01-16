package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICuentaBancariaRepository;
import com.example.demo.repository.modelo.CuentaBancaria;

@Service
public class CuentaBancariaService implements ICuentaBancariaService {

	@Autowired
	ICuentaBancariaRepository bancariaRepository;
	
	@Override
	public void guardar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepository.insertar(bancaria);
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.seleccionar(id);
	}

	@Override
	public void actualizar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepository.actualizar(bancaria);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.bancariaRepository.eliminar(id);
	}

	@Override
	public CuentaBancaria buscararPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.seleccionarPorNumero(numero);
	}

}
