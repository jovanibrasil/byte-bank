package com.jovanibrasil.bytebank;

import com.jovanibrasil.bytebank.exceptions.ContaException;
import com.jovanibrasil.bytebank.modelo.conta.CalculadorImposto;
import com.jovanibrasil.bytebank.modelo.conta.ContaCorrente;
import com.jovanibrasil.bytebank.modelo.conta.ContaPoupanca;
import com.jovanibrasil.bytebank.modelo.conta.SeguroDeVida;
import com.jovanibrasil.bytebank.modelo.funcionarios.Cliente;
import com.jovanibrasil.bytebank.modelo.funcionarios.ControleBonificacao;
import com.jovanibrasil.bytebank.modelo.funcionarios.EditorVideo;
import com.jovanibrasil.bytebank.modelo.funcionarios.Funcionario;
import com.jovanibrasil.bytebank.modelo.funcionarios.Gerente;
import com.jovanibrasil.bytebank.modelo.funcionarios.SistemaInterno;
import com.jovanibrasil.bytebank.modelo.funcionarios.Titular;

public class Main {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente(2222);
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		Funcionario f1 = new Gerente(2222);
		f1.setNome("Jovani");
		f1.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Brasil");
		ev.setSalario(1500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
		
		ContaCorrente cc = new ContaCorrente(123, 456, new Titular("Jovani", "123.123.123-12", "DEV"));
		ContaPoupanca cp = new ContaPoupanca(123, 456, new Titular("Brasil", "123.123.123-12", "DB"));
		
		cc.depositar(1000.0);
		cp.depositar(2000.0);
		
		try {
			cc.transfere(500, cp);
		} catch (ContaException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
		
		Cliente cliente = new Cliente(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g1);
		si.autentica(cliente);
		
		SeguroDeVida sdv = new SeguroDeVida();
		
		CalculadorImposto cdi = new CalculadorImposto();
		cdi.registra(cc);
		cdi.registra(sdv);
		System.out.println("Tributos: " + cdi.getTotalImposto());
		
		try {
			cc.sacar(2000);
		} catch (ContaException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println(cc);
		System.out.println(cp);
		
		
	}

}
