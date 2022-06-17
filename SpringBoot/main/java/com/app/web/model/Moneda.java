package com.app.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="moneda")
public class Moneda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombre", nullable = false, length = 50, unique = true)
	private String nombre;
	
	@Column(name = "valor", nullable = false, length = 10)
	private float valor;
	
	public Moneda() {}

	public Moneda(String nombre, float valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	public Moneda(int id, String nombre, float valor) {
		this.id = id;
		this.nombre = nombre;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Moneda [id=" + id + ", nombre=" + nombre + ", valor=" + valor + "]";
	}
	
	
}
