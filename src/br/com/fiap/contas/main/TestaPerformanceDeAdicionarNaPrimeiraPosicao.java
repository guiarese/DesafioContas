package br.com.fiap.contas.main;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Iniciando ArrayList...");
		long inicio = System.currentTimeMillis();
		
		// trocar depois por ArrayList
		List<Integer> teste = new ArrayList<>();
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		
		for (int i = 0; i < 30000; i++) {
			teste.get(i);
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		
		System.out.println("Tempo gasto: " + tempo);
		
		
		
		
		
//		System.out.println("Iniciando LinkedList...");
//		long inicio2 = System.currentTimeMillis();
//		
//		// trocar depois por ArrayList
//		List<Integer> teste2 = new LinkedList<>();
//		for (int i = 0; i < 30000; i++) {
//			teste2.add(0, i);
//		}
//		
//		for (int i = 0; i < 30000; i++) {
//			teste2.get(i);
//		}
//		
//		long fim2 = System.currentTimeMillis();
//		double tempo2 = (fim2 - inicio2) / 1000.0;
//		
//		System.out.println("Tempo gasto: " + tempo2);
	}

}
