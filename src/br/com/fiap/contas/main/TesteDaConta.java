package br.com.fiap.contas.main;

//import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;
import br.com.fiap.contas.modelo.SeguroDeVida;

public class TesteDaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Comentado pois se tornou uma classe abstrata
		//Conta c1 = new Conta();
		//System.out.println(c1.getTipo());
		
		ContaCorrente cc1 = new ContaCorrente();
		ContaPoupanca cp1 = new ContaPoupanca();
		
		cc1.setTitular("Guilherme Rezende");
		cc1.setAgencia("1234");
		cc1.setNumero(1234);
		
		cp1.setTitular("Outro Teste");
		cp1.setAgencia("9999");
		cp1.setNumero(9876);		
		
		System.out.println(cc1.getTipo());
		System.out.println(cp1.getTipo());
		
		System.out.println(cc1.toString());
		System.out.println(cp1.toString());
		
		SeguroDeVida s1 = new SeguroDeVida();
		
		s1.setNumeroApolice(123);
		s1.setTitular("Guilherme Rezende");
		s1.setValor(1000);
		
		System.out.println("----------------------------------");
		System.out.println(s1.getNumeroApolice() + " - " +
						   s1.getTitular() + " - " +
					       s1.getValor() + " - " + 
						   s1.getTipo() + " - " +
					       s1.getValorImposto());
		
		//Comentado para teste de exception de sacar valor negativo e depositar valor negativo
		//ContaCorrente c2 = new ContaCorrente();
		//c2.saca(-10);
		//c2.deposita(-100);
		
		//Comentado para teste de nova exception que verifica se o valor de saque é menor do que o valor depositado
		//ContaCorrente c2 = new ContaCorrente();
		//c2.deposita(1000);
		//c2.saca(2000);
		
		ContaCorrente cc2 = new ContaCorrente();
		ContaCorrente cc3 = new ContaCorrente();
		
		cc2.setAgencia("123");
		cc2.setNumero(111);
		cc3.setAgencia("123");
		cc3.setNumero(111);
		
		System.out.println("----------------------------------");
		System.out.println(cc2.equals(cc3));
		

	}

}
