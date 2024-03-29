package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICuentaBancariaRepository;
import com.example.demo.repository.ITransferenciaRepository;
import com.example.demo.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService{

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;
	
	@Override
	public void guardar(String ctaO, String ctaD, BigDecimal monto) {
		// TODO Auto-generated method stub
		
		CuentaBancaria ctao= this.bancariaRepository.seleccionarPorNumero(ctaO) ;
		//calcula y debita la transferencia
		BigDecimal comision = monto.multiply(new BigDecimal(1.10));
		BigDecimal nuevoSaldo=ctao.getSaldo().subtract(monto).subtract(comision);
		ctao.setSaldo(nuevoSaldo);
		CuentaBancaria ctad=this.bancariaRepository.seleccionarPorNumero(ctaD);	
		BigDecimal nuevoSaldoD=ctad.getSaldo().add(monto);
		ctad.setSaldo(nuevoSaldoD);
		
		Transferencia t1 = new Transferencia();
		t1.setCtaOrigen(ctao);
		t1.setCtadestino(ctad);
		t1.setMontoT(monto);
		this.iTransferenciaRepository.insertar(t1);
		
	}

}


