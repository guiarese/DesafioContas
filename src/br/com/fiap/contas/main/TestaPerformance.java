package br.com.fiap.contas.main;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando ArrayList...");
		
		//ArrayList<Integer> teste = new ArrayList<>();
		Collection<Integer> teste = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		int total = 30000;
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}

		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		
		System.out.println("Tempo gasto: " + tempo);
		
		
		System.out.println("Iniciando HashSet...");
		
		ArrayList<Integer> teste2 = new ArrayList<>();
		long inicio2 = System.currentTimeMillis();
		int total2 = 30000;
		
		for (int i = 0; i < total2; i++) {
			teste2.add(i);
		}
		for (int i = 0; i < total2; i++) {
			teste2.contains(i);
		}

		long fim2 = System.currentTimeMillis();
		long tempo2 = fim2 - inicio2;
		
		System.out.println("Tempo gasto: " + tempo2);
	}

}
