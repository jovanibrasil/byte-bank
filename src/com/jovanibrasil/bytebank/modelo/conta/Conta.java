package com.jovanibrasil.bytebank.modelo.conta;

import com.jovanibrasil.bytebank.exceptions.ContaException;
import com.jovanibrasil.bytebank.modelo.funcionarios.Titular;

/**
 * Classe que representa uma conta do banco.
 * 
 * @author jovani.brasil
 *
 */
public abstract class Conta {

	private static int totalContas = 0;
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Titular titular;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir
	 * da agência e número.
	 * 
	 * @param agencia
	 * @param numero
	 * @param titular
	 */
	public Conta(int agencia, int numero, Titular titular) {
		
		if(agencia < 1) {
			throw new IllegalArgumentException("Agencia inválida");
		}
		if(numero < 1) {
			throw new IllegalArgumentException("Numero de conta inválido");
		}
		
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
	
	/**
	 * Valor precisa ser maior que o saldo.
	 * 
	 * @param valor
	 * @throws ContaException
	 */
	public void sacar(double valor) throws ContaException {
		if(valor < 0) {
			throw new ContaException("Valor inválido (negativo)");	
		}
		if(this.saldo < valor) {
			throw new ContaException("Saldo insuficiente - Saldo: " + this.saldo + " Sacado: " + valor);
		}
		
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws ContaException {
		this.sacar(valor);
		destino.depositar(valor);
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
