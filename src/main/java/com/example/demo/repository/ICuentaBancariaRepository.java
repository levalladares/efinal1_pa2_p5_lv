package com.example.demo.repository;

import com.example.demo.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {

	public void insertar(CuentaBancaria bancaria);

	public CuentaBancaria seleccionar(Integer id);

	public void actualizar(CuentaBancaria bancaria);

	public void eliminar(Integer id);
	
	public CuentaBancaria seleccionarPorNumero (String numero);

}
