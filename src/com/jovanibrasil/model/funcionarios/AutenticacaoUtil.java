package com.jovanibrasil.model.funcionarios;

public class AutenticacaoUtil {

	private int senha;
	
	public AutenticacaoUtil(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		return this.senha == senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
