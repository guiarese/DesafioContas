package br.com.fiap.contas.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

	private String nome;
	private int numero;
	private ContaCorrente[] contas;
	private List<Conta> contasLista;
	Map<String, Conta> mapaDeContas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
		contasLista = new ArrayList<Conta>();
		mapaDeContas = new HashMap<String, Conta>();
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void adiciona(ContaCorrente c) {
		for (int i = 0; i < this.contas.length; i++) {
			if (contas[i] == null) {
				contas[i] = c;
				break;
			}
		}
	}

	public void mostraContas() {
		for (int i = 0; i < this.contas.length; i++) {
			if (contas[i] != null) {
				System.out.println(contas[i].getTitular() + " - " + contas[i].getAgencia() + " - "
						+ contas[i].getNumero() + " - " + contas[i].getSaldo());
			} else {
				break;
			}

		}
	}
	
	public void adicionaList(Conta c) {
		contasLista.add(c);
		mapaDeContas.put(c.getTitular(),c);
	}
	
	public Conta pega(int x) {
		return contasLista.get(x);
	}
	
	public int pegaQuantidadeDeContas() {
		return contasLista.size();
	}
	
	public Conta buscaPorTitular(String nome) {
		return mapaDeContas.get(nome);		
	}

}
