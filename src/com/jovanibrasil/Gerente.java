package com.jovanibrasil;

public class Gerente extends Funcionario {

	private int senha;

	public Gerente() {
		super();
		this.percentualBonificacao = 1.0;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	
}
