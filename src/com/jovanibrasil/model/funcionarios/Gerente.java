package com.jovanibrasil.model.funcionarios;

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente(int senha) {
		super();
		this.autenticador = new AutenticacaoUtil(senha);
	}
	
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.7 + super.getSalario();
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
