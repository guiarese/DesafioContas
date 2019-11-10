package br.com.fiap.contas.modelo;

public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public double saca(double valor) {
		return this.saldo -= valor;
	}

	public abstract String getTipo();

//	public void transfere(double valor, Conta conta) {
//		this.saca(valor);
//		conta.deposita(valor);
//	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null) {
			return false;
		}
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}

	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

}
