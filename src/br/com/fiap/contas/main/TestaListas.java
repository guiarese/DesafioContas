package br.com.fiap.contas.main;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.LinkedList;
import java.util.Random;

import br.com.fiap.contas.modelo.*;

public class TestaListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		
		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();
		ContaCorrente cc3 = new ContaCorrente();
		
		cc1.setTitular("Luciano");
		cc2.setTitular("Abner");
		cc3.setTitular("Guilherme");
		
		contas.add(cc1);
		contas.add(cc2);
		contas.add(cc3);
		
		System.out.println("Antes do sort " + contas);
		
		Collections.sort(contas);
		
		System.out.println("Depois do sort " + contas);
		
		System.out.println("-----------------------------------");
		
		Random random = new Random();
		
		//Teste LinkedList
		//LinkedList<ContaCorrente> contas2 = new LinkedList<ContaCorrente>();
		ArrayList<ContaCorrente> contas2 = new ArrayList<ContaCorrente>();
		contas2.add(cc1);
		contas2.add(cc2);
		contas2.add(cc3);
		
		for(ContaCorrente i : contas2) {
			i.deposita(random.nextInt(1000));
			System.out.println(i + " - " + i.getSaldo());
		}
		

	}

}
