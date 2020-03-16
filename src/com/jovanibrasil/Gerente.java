package com.jovanibrasil;

public class Gerente extends Funcionario {

	private int senha;

	public Gerente() {
		super();
	}
	
	@Override
	public double getBonificacao() {
		return super.salario * 0.1;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	
}
