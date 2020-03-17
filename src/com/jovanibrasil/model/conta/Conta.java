package com.jovanibrasil.model.conta;

import com.jovanibrasil.model.funcionarios.Titular;

public abstract class Conta {

	private static int totalContas = 0;
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Titular titular;
	
	public Conta(int agencia, int numero, Titular titular) {
		// TODO validation
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		Conta.totalContas++;
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		}
	}
	
	public boolean sacar(double valor) {
		if(valor > 0 && this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public Titular getTitular() {
		return titular;
	}
	
	public static int getTotalContas() {
		return Conta.totalContas;
	}
	
}
