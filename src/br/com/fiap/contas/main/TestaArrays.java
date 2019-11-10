package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaArrays {
	
	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[10];
		double media = 0;
		
		for (int i = 0; i < contas.length; i++) {
			
			ContaCorrente conta = new ContaCorrente();
			conta.deposita(i * 100);
			media += conta.getSaldo();
			contas[i] = conta;
			
		}
		
		System.out.println("Média = " + media / contas.length);
		
	}

}
