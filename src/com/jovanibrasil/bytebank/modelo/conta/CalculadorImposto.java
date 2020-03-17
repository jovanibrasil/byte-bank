package com.jovanibrasil.bytebank.modelo.conta;

public class CalculadorImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel tributavel) {
		this.totalImposto += tributavel.getValorImposto();
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
}