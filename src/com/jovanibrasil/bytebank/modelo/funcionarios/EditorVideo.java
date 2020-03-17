package com.jovanibrasil.bytebank.modelo.funcionarios;

public class EditorVideo extends Funcionario {

	@Override
	public double getBonificacao() {
		return 0.1 * super.getSalario() + 100;
	}
	
}
