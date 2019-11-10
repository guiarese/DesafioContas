package br.com.fiap.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	public String getTipo() {
		return "Conta Corrente";
	}
	
	@Override
	public double saca(double valor){
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor menor que zero");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}
		return this.saldo -= (valor + 0.10);

	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return this.getSaldo() * 0.01;
	}

}
