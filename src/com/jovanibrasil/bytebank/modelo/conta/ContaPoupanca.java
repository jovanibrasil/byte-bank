package com.jovanibrasil.bytebank.modelo.conta;

import com.jovanibrasil.bytebank.modelo.funcionarios.Titular;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero, Titular titular) {
		super(agencia, numero, titular);
	}

	@Override
	public String toString() {
		return "ContaPoupanca " + super.toString();
	}
	
}
