package com.jovanibrasil;

public class Titular {
	
	private String nome;
	private String cpf;
	private String profissao;
	
	public Titular(String nome, String cpf, String profissao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getProfissao() {
		return profissao;
	}
	
}
