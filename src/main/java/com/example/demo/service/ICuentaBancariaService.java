package com.example.demo.service;

import com.example.demo.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	
	public void guardar(CuentaBancaria bancaria);

	public CuentaBancaria buscar(Integer id);

	public void actualizar(CuentaBancaria bancaria);

	public void eliminar(Integer id);
	
	public CuentaBancaria buscararPorNumero (String numero);

}
