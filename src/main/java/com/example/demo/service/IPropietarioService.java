package com.example.demo.service;

import com.example.demo.repository.modelo.Propietario;

public interface IPropietarioService {
	
	public void guardar(Propietario propietario);
	public Propietario buscar(Integer id );
	public void actualizar(Propietario propietario);
	public void eliminar(Integer id);


}
