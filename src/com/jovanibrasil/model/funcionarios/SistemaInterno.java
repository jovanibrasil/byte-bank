package com.jovanibrasil.model.funcionarios;

public class SistemaInterno {

	private final int senha = 2222;
	
	public void autentica(Autenticavel funcionarioAutenticavel) {
		if(funcionarioAutenticavel.autentica(this.senha)) {
			System.out.println("Autenticou com sucesso!");
		} else {
			System.out.println("Não foi possível autenticar!");
		}
	}
	
}
