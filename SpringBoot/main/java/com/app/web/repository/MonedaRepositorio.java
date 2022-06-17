package com.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.model.Moneda;

@Repository
public interface MonedaRepositorio extends JpaRepository<Moneda, Integer>{
	
}
