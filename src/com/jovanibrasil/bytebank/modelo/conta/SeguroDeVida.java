package com.jovanibrasil.bytebank.modelo.conta;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}
