package com.jovanibrasil.bytebank.modelo.funcionarios;

/**
 * Classe que representa um cliente do banco.
 * 
 * @author Jovani Brasil.
 *
 */
public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public Cliente(int senha) {
		this.autenticador = new AutenticacaoUtil(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		autenticador.setSenha(senha);
	}

}
