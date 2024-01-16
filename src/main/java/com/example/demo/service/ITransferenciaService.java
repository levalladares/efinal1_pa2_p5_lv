package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.Transferencia;

public interface ITransferenciaService {

	public void guardar(String ctaO, String ctad, BigDecimal monto );
	
	
	public List<Transferencia> buscarTodas ();
}
