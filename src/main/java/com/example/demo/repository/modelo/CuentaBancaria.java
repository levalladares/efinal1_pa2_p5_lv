package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuentaBancaria")
public class CuentaBancaria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cuentaBancaria")
	@SequenceGenerator(name = "seq_cuentaBancaria",sequenceName = "seq_cuentaBancaria", allocationSize = 1)
	@Column(name = "ctab_id")
	private Integer id;
	@Column(name = "ctab_numero")
	private String numero;
	@Column(name = "ctab_tipo")
	private String tipo;
	@Column(name = "ctab_saldo")
	private BigDecimal saldo;
	
	@OneToOne(mappedBy = "cuentaBancaria", cascade = CascadeType.ALL)
	private Propietario propietario;
	
	@OneToMany(mappedBy = "cuentaBancaria")
	private List<Transferencia> transferencias;

	
	
	//GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo
				+ ", propietario=" + propietario + "]";
	}
	
	
	
	

}
