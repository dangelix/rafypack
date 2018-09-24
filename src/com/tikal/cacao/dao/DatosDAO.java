package com.tikal.cacao.dao;

import java.util.List;

import com.tikal.unoconnections.tralix.Datos;

public interface DatosDAO {

	public void guardar(Datos d);
	
	public void guardar(List<Datos> lista);
	
	public List<Datos> getByRFC(String rfc);
	
	public List<Datos> todos();
	
	public void eliminar(Datos d);
	
	public void eliminar(List<Datos> lista);
	
	public int indice();
}
