package com.jovanibrasil.bytebank.modelo.conta;

public class AcaoBolsa implements Tributavel {

	@Override
	public double getValorImposto() {
		return 50;
	}

}
