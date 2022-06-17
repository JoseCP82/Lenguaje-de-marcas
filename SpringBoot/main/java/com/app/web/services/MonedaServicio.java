package com.app.web.services;

import java.util.List;

import com.app.web.model.Moneda;

public interface MonedaServicio {

	public Moneda insert(Moneda moneda);
	
	public List<Moneda> getAll();
	
	public Moneda get(int id);
	
	public Moneda update(Moneda moneda);
	
	public void delete(int id);
}
