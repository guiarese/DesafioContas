package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Banco;
import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banco banco = new Banco("Itaú",341);
		
		for (int i = 1; i <= 5; i++) {
			ContaCorrente conta = new ContaCorrente();
			conta.setTitular("Titular " + i);
			conta.setNumero(i);
			conta.setAgencia("1000");
			conta.deposita(i * 1000);
			banco.adiciona(conta);
		}
		
		System.out.println("-------------------------------");
		banco.mostraContas();
		System.out.println("-------------------------------");
		
		//Opcional = adiciona, pega, pegaQuantidadeDeContas
		Banco banco2 = new Banco("Santander",321);
		ContaCorrente conta2 = new ContaCorrente();
		ContaCorrente conta3 = new ContaCorrente();
		conta2.deposita(1000);
		conta2.setTitular("Teste opcional um");
		conta3.deposita(2000);
		conta3.setTitular("Teste opcional dois");
		banco2.adicionaList(conta2);
		banco2.adicionaList(conta3);
		System.out.println(banco2.pega(0));
		System.out.println(banco2.pegaQuantidadeDeContas());
		
		System.out.println("-------------------------------");
		//Opcional = mapa de titular
		System.out.println(banco2.buscaPorTitular("Teste opcional"));
		System.out.println(banco2.buscaPorTitular("Teste opcional um"));
		
	}

}
