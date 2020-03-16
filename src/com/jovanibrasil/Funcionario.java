package com.jovanibrasil;

public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	protected double percentualBonificacao;
	
	public Funcionario() {
		this.percentualBonificacao = 0.1;
	}
	
	public double getBonificacao() {
		return this.salario * percentualBonificacao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
