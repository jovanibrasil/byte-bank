package com.jovanibrasil;

import com.jovanibrasil.model.conta.CalculadorImposto;
import com.jovanibrasil.model.conta.ContaCorrente;
import com.jovanibrasil.model.conta.ContaPoupanca;
import com.jovanibrasil.model.conta.SeguroDeVida;
import com.jovanibrasil.model.funcionarios.Cliente;
import com.jovanibrasil.model.funcionarios.ControleBonificacao;
import com.jovanibrasil.model.funcionarios.EditorVideo;
import com.jovanibrasil.model.funcionarios.Funcionario;
import com.jovanibrasil.model.funcionarios.Gerente;
import com.jovanibrasil.model.funcionarios.SistemaInterno;
import com.jovanibrasil.model.funcionarios.Titular;

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
		
		ContaCorrente cc = new ContaCorrente(123, 123, new Titular("Jovani", "123.123.123-12", "DEV"));
		ContaPoupanca cp = new ContaPoupanca(123, 123, new Titular("Brasil", "123.123.123-12", "DB"));
		
		cc.depositar(1000.0);
		cp.depositar(2000.0);
		
		cc.transfere(500, cp);
		
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
		
	}

}
