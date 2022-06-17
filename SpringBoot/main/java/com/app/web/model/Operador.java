package com.app.web.model;

public class Operador {

	private float cantidadEuro;
	private Moneda moneda;
	
	public Operador() {}

	public Operador(float cantidaEuro, Moneda moneda) {
		this.cantidadEuro = cantidaEuro;
		this.moneda = moneda;
	}

	public Moneda getMoneda() {
		return moneda;
	}

	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}

	public float getCantidadEuro() {
		return cantidadEuro;
	}

	public void setCantidadEuro(float cantidadEuro) {
		this.cantidadEuro = cantidadEuro;
	}
	
	
}
