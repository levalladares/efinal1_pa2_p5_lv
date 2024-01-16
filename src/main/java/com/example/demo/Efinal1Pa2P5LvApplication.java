package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Transferencia;
import com.example.demo.service.ICuentaBancariaService;
import com.example.demo.service.ITransferenciaService;

@SpringBootApplication
public class Efinal1Pa2P5LvApplication implements CommandLineRunner{

	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P5LvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Propietario p1 = new Propietario();
		p1.setNombre("Luis");
		p1.setApellido("Valladares");
		p1.setCedula("78485454");
		
		CuentaBancaria c1= new CuentaBancaria();
		c1.setNumero("123456");
		c1.setPropietario(p1);
		c1.setSaldo(new BigDecimal(100));
		c1.setTipo("ahorros");
		//this.bancariaService.guardar(c1);
		
		Propietario p2 = new Propietario();
		p2.setNombre("Jose");
		p2.setApellido("Bastidas");
		p2.setCedula("78485474");
		
		CuentaBancaria c2= new CuentaBancaria();
		c2.setNumero("654321");
		c2.setPropietario(p2);
		c2.setSaldo(new BigDecimal(50));
		c2.setTipo("ahorros");
		//this.bancariaService.guardar(c2);
		
		this.iTransferenciaService.guardar("123456", "654321", new BigDecimal(20));
		
		CuentaBancaria cta= this.bancariaService.buscararPorNumero("123456");
		System.out.println(cta.getSaldo());
		
		CuentaBancaria cta2= this.bancariaService.buscararPorNumero("654321");
		System.out.println(cta2.getSaldo());
		
		
		System.out.println("Imprimir");
		List<Transferencia> trasnferencias =this.iTransferenciaService.buscarTodas();
		for (Transferencia t : trasnferencias) {
			System.out.println(t);
		}
		
	}

}
