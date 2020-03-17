package com.jovanibrasil.model.conta;

import com.jovanibrasil.exceptions.ContaException;
import com.jovanibrasil.model.funcionarios.Titular;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero, Titular titular) {
		super(agencia, numero, titular);
	}	
	
	@Override
	public void sacar(double valor) throws ContaException {
		double valorComTaxa = valor + 0.2;
		super.sacar(valorComTaxa);
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
}
