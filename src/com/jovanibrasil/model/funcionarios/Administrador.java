package com.jovanibrasil.model.funcionarios;

public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public Administrador(int senha) {
		super();
		this.autenticador = new AutenticacaoUtil(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
	}

	@Override
	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		autenticador.setSenha(senha);
	}

}
