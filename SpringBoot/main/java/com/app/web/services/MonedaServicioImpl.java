package com.app.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.model.Moneda;
import com.app.web.repository.MonedaRepositorio;

@Service
public class MonedaServicioImpl implements MonedaServicio{

	@Autowired
	private MonedaRepositorio repo;
	
	@Override
	public Moneda insert(Moneda moneda) {
		return this.repo.save(moneda);
	}
	
	@Override
	public List<Moneda> getAll() {
		return this.repo.findAll();
	}

	@Override
	public Moneda get(int id) {
		return this.repo.findById(id).get();
	}

	@Override
	public Moneda update(Moneda moneda) {
		return this.repo.save(moneda);
	}

	@Override
	public void delete(int id) {
		this.repo.deleteById(id);
	}

	

}
