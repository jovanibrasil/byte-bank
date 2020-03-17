package com.jovanibrasil.model.funcionarios;

public class ControleBonificacao {

	private double soma;
	
	public void registra(Funcionario g) {
		System.out.println(g.getClass().getName());
		double boni = g.getBonificacao();
		this.soma += boni;
	}
	
	public double getSoma() {
		return soma;
	}
	
}
