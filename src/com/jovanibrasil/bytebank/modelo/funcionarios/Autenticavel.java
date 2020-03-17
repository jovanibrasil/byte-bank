package com.jovanibrasil.bytebank.modelo.funcionarios;

public interface Autenticavel {

	public boolean autentica(int senha);
	public void setSenha(int senha);
	
}
