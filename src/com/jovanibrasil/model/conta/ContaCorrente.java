package com.jovanibrasil.model.conta;

import com.jovanibrasil.model.funcionarios.Titular;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero, Titular titular) {
		super(agencia, numero, titular);
	}	
	
	@Override
	public boolean sacar(double valor) {
		double valorComTaxa = valor + 0.2;
		return super.sacar(valorComTaxa);
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
}
