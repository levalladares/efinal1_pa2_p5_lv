package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "trasnferencia")
public class Transferencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_transferencia")
	@SequenceGenerator(name = "seq_transferencia",sequenceName = "seq_transferencia", allocationSize = 1)
	@Column(name = "tran_id")
	private Integer id;
	@Column(name = "tran_fechaT")
	private LocalDate fechaT;
	@Column(name = "tran_montoT")
	private BigDecimal montoT;
	@Column(name = "tran_comisionT")
	private BigDecimal comisionT;
	
	@ManyToOne
	@JoinColumn(name = "trans_id_ctao")
	private CuentaBancaria ctaOrigen;
	
	@ManyToOne
	@JoinColumn(name = "trans_id_ctad")
	private CuentaBancaria ctadestino;

	
	//GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFechaT() {
		return fechaT;
	}

	public void setFechaT(LocalDate fechaT) {
		this.fechaT = fechaT;
	}

	public BigDecimal getMontoT() {
		return montoT;
	}

	public void setMontoT(BigDecimal montoT) {
		this.montoT = montoT;
	}

	public BigDecimal getComisionT() {
		return comisionT;
	}

	public void setComisionT(BigDecimal comisionT) {
		this.comisionT = comisionT;
	}

	public CuentaBancaria getCtaOrigen() {
		return ctaOrigen;
	}

	public void setCtaOrigen(CuentaBancaria ctaOrigen) {
		this.ctaOrigen = ctaOrigen;
	}

	public CuentaBancaria getCtadestino() {
		return ctadestino;
	}

	public void setCtadestino(CuentaBancaria ctadestino) {
		this.ctadestino = ctadestino;
	}

	


}



